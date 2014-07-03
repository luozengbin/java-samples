package jp.jizai.sample.jaxb.datetime.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import jp.jizai.sample.jaxb.datetime.model.DateTestModel;
import jp.jizai.sample.jaxb.datetime.model.DateTestModel1;
import jp.jizai.sample.jaxb.datetime.model.DateTestModel2;
import jp.jizai.sample.jaxb.datetime.model.DateTestModel3;
import jp.jizai.sample.jaxb.datetime.model.DateTestModel4;
import jp.jizai.sample.jaxb.datetime.util.XMLGregorianCalendarUtil;

public class TestMarshaller {

    static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

    public static void main(String[] args) throws JAXBException {

        int modelNum = Integer.valueOf(args[0]);
        int loop = Integer.valueOf(args[1]);
        int limit = args.length >= 3 ? Integer.valueOf(args[2]) : 100;

        JAXBContext jc = null;

        switch (modelNum) {
        case 1:
            jc = JAXBContext.newInstance(DateTestModel1.class);
            break;
        case 2:
            jc = JAXBContext.newInstance(DateTestModel2.class);
            break;
        case 3:
            jc = JAXBContext.newInstance(DateTestModel3.class);
            break;
        case 4:
            jc = JAXBContext.newInstance(DateTestModel4.class);
            break;
        default:
            System.out.println("worng modelNum!!!");
            return;
        }

        Marshaller m = jc.createMarshaller();

        int dropCount = 0;
        int acceptCount = 0;
        double acceptSum = 0;
        double dropSum = 0;

        long start = 0;
        long end = 0;
        DateTestModel data = null;
        Date value = null;
        
        for (int i = 0; i < loop; i++) {
            // 送信メッセージの作成
            Date now = Calendar.getInstance().getTime();
            
            start = System.nanoTime();
            switch (modelNum) {
            case 1:
                data = new DateTestModel1();
                DateTestModel1 d1 = (DateTestModel1) data;
                d1.setDatetime(XMLGregorianCalendarUtil.toXMLGregorianCalendar(now));
                break;
            case 2:
                data = new DateTestModel2();
                DateTestModel2 d2 = (DateTestModel2) data;
                d2.setDatetime(now);
                break;
            case 3:
                data = new DateTestModel3();
                DateTestModel3 d3 = (DateTestModel3) data;
                Calendar cal = Calendar.getInstance();
                cal.setTime(now);
                d3.setDatetime(cal);
                break;
            case 4:
                data = new DateTestModel4();
                DateTestModel4 d4 = (DateTestModel4) data;
                d4.setDatetime(sdf.format(now));
                break;
            default:
                return;
            }

            m.marshal(data, System.out);
            value = data.getDate();
            end = System.nanoTime();

            long cost = TimeUnit.MICROSECONDS.convert(end - start, TimeUnit.NANOSECONDS);

            System.out.println(String.format("\n%s, %s", cost, sdf.format(value)));

            if (cost <= limit) {
                acceptCount++;
                acceptSum += cost;
            } else {
                dropCount++;
                dropSum += cost;
            }
        }

        int count = acceptCount + dropCount;
        System.out.println("--------------Marshaller----------------------");
        System.out.println("modelNum :" + modelNum);
        System.out.println("Accept/Count :" + acceptCount + "/" + count);
        System.out.println("Drop/Count :" + dropCount + "/" + count);
        System.out.println("AcceptAvg :" + acceptSum / acceptCount);
        System.out.println("DroptAvg :" + dropSum / dropCount);
        System.out.println("---------------------------------------------");
    }
}
