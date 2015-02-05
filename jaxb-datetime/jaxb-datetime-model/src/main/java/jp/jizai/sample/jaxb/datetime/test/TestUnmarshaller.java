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

public class TestUnmarshaller implements Runnable {

    static final String msgTemp = new StringBuilder()
            .append("      <ns1:DateTestModel%d  xmlns:ns1=\"http://sample.jizai.jp/jaxb/datetime/model\">")
            .append("         <ns1:datetime>%s</ns1:datetime>").append("      </ns1:DateTestModel%d>").toString();

    public static void main(String[] args) throws JAXBException, InterruptedException {

        int modelNum = Integer.valueOf(args[0]);
        int threadCount = Integer.valueOf(args[1]);
        int loop = Integer.valueOf(args[2]);
        int limit = args.length >= 4 ? Integer.valueOf(args[3]) : 100;

        Thread[] threads = new Thread[threadCount];
        TestUnmarshaller[] tests = new TestUnmarshaller[threadCount];
        ThreadGroup tg = new ThreadGroup("TestMarshallerLoader");

        for (int i = 0; i < threadCount; i++) {
            tests[i] = new TestUnmarshaller(modelNum, loop, limit);
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

        System.out.println("--------------TestUnmarshaller----------------------");
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

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");


    public TestUnmarshaller(int modelNum, int loop, int limit) {
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

            Unmarshaller u = jc.createUnmarshaller();

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
            System.out.println(this.hashCode() + ">>> " + "--------------TestUnmarshaller----------------------");
            System.out.println(this.hashCode() + ">>> " + "modelNum :" + modelNum);
            System.out.println(this.hashCode() + ">>> " + "Accept/Count :" + acceptCount + "/" + count);
            System.out.println(this.hashCode() + ">>> " + "Drop/Count :" + dropCount + "/" + count);
            System.out.println(this.hashCode() + ">>> " + "AcceptAvg :" + acceptSum / acceptCount);
            System.out.println(this.hashCode() + ">>> " + "DropAvg :" + dropSum / dropCount);
            System.out.println(this.hashCode() + ">>> " + "---------------------------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public int getLoop() {
        return loop;
    }

    public void setLoop(int loop) {
        this.loop = loop;
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


}
