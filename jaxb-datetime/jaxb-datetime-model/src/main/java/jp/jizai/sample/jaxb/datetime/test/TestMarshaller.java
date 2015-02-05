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

public class TestMarshaller implements Runnable {

    public static void main(String[] args) throws JAXBException, InterruptedException {

        int modelNum = Integer.valueOf(args[0]);
        int threadCount = Integer.valueOf(args[1]);
        int loop = Integer.valueOf(args[2]);
        int limit = args.length >= 4 ? Integer.valueOf(args[3]) : 100;

        Thread[] threads = new Thread[threadCount];
        TestMarshaller[] tests = new TestMarshaller[threadCount];
        ThreadGroup tg = new ThreadGroup("TestMarshallerLoader");

        for (int i = 0; i < threadCount; i++) {
            tests[i] = new TestMarshaller(modelNum, loop, limit);
            threads[i] = new Thread(tg, tests[i]);
            threads[i].start();
        }

        int dropCount = 0;
        int acceptCount = 0;
        double acceptSum = 0;
        double dropSum = 0;

        for (int i = 0; i < threadCount; i++) {
            threads[i].join();
            acceptCount += tests[i].getAcceptCount();
            dropCount += tests[i].getDropCount();

            acceptSum += tests[i].getAcceptSum();
            dropSum += tests[i].getDropSum();
        }

        int count = acceptCount+ dropCount;

        System.out.println("--------------Marshaller----------------------");
        System.out.println("threadCount :" + threadCount);
        System.out.println("modelNum :" + modelNum);
        System.out.println("DropThreshold :" + limit);
        System.out.println("Accept/Count :" + acceptCount + "/" + count);
        System.out.println("Drop/Count :" + dropCount + "/" + count);
        System.out.println("AcceptAvg :" + acceptSum / acceptCount);
        System.out.println("DropAvg :" + dropSum / dropCount);
        System.out.println("---------------------------------------------");

    }

    private int modelNum;
    private int loop;
    private int limit;

    private int dropCount = 0;
    private int acceptCount = 0;
    private double acceptSum = 0;
    private double dropSum = 0;

    // スレッド毎に
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

    public TestMarshaller(int modelNum, int loop, int limit) {
        this.modelNum = modelNum;
        this.loop = loop;
        this.limit = limit;
    }

    @Override
    public void run() {

        try {
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

            dropCount = 0;
            acceptCount = 0;
            acceptSum = 0;
            dropSum = 0;

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
            System.out.println(this.hashCode() + ">>> " + "--------------Marshaller----------------------");
            System.out.println(this.hashCode() + ">>> " +"modelNum :" + modelNum);
            System.out.println(this.hashCode() + ">>> " +"Accept/Count :" + acceptCount + "/" + count);
            System.out.println(this.hashCode() + ">>> " +"Drop/Count :" + dropCount + "/" + count);
            System.out.println(this.hashCode() + ">>> " +"AcceptAvg :" + acceptSum / acceptCount);
            System.out.println(this.hashCode() + ">>> " +"DropAvg :" + dropSum / dropCount);
            System.out.println(this.hashCode() + ">>> " +"---------------------------------------------");

        } catch (Exception e) {
            System.out.println("interrupted");
            e.printStackTrace(System.out);
            throw new RuntimeException(e);
        }

    }

    public int getModelNum() {
        return modelNum;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }

    public int getLoop() {
        return loop;
    }

    public void setLoop(int loop) {
        this.loop = loop;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getDropCount() {
        return dropCount;
    }

    public void setDropCount(int dropCount) {
        this.dropCount = dropCount;
    }

    public int getAcceptCount() {
        return acceptCount;
    }

    public void setAcceptCount(int acceptCount) {
        this.acceptCount = acceptCount;
    }

    public double getAcceptSum() {
        return acceptSum;
    }

    public void setAcceptSum(double acceptSum) {
        this.acceptSum = acceptSum;
    }

    public double getDropSum() {
        return dropSum;
    }

    public void setDropSum(double dropSum) {
        this.dropSum = dropSum;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

}
