package jp.jizai.sample.jaxb.datetime.test;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import jp.jizai.sample.jaxb.datetime.model.DateTestModel;
import jp.jizai.sample.jaxb.datetime.model.DateTestModel1;
import jp.jizai.sample.jaxb.datetime.model.DateTestModel2;
import jp.jizai.sample.jaxb.datetime.model.DateTestModel3;
import jp.jizai.sample.jaxb.datetime.model.DateTestModel4;

public class TestUnmarshaller {

    static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

    static final String msgTemp = new StringBuilder()
            .append("      <ns1:DateTestModel%d  xmlns:ns1=\"http://sample.jizai.jp/jaxb/datetime/model\">")
            .append("         <ns1:datetime>%s</ns1:datetime>").append("      </ns1:DateTestModel%d>").toString();

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

        Unmarshaller u = jc.createUnmarshaller();

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

            StringReader sr = new StringReader(String.format(msgTemp, modelNum, sdf.format(now), modelNum));

            start = System.nanoTime();
            data = (DateTestModel) u.unmarshal(sr);
            value = data.getDate();
            end = System.nanoTime();

            long cost = TimeUnit.MICROSECONDS.convert(end - start, TimeUnit.NANOSECONDS);

            System.out.println(String.format("%s, %s", cost, sdf.format(value)));

            if (cost <= limit) {
                acceptCount++;
                acceptSum += cost;
            } else {
                dropCount++;
                dropSum += cost;
            }
        }

        int count = acceptCount + dropCount;
        System.out.println("--------------TestUnmarshaller----------------------");
        System.out.println("modelNum :" + modelNum);
        System.out.println("Accept/Count :" + acceptCount + "/" + count);
        System.out.println("Drop/Count :" + dropCount + "/" + count);
        System.out.println("AcceptAvg :" + acceptSum / acceptCount);
        System.out.println("DroptAvg :" + dropSum / dropCount);
        System.out.println("---------------------------------------------");
    }
}
