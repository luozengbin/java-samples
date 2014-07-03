package jp.jizai.sample.jaxb;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LoadRunner {

    public static void main(String[] args) throws Exception {
        
        String url = args[0];                    //"http://localhost:8080/jaxb-datetime-service/TestService1"
        int modelNum = Integer.valueOf(args[1]); // 1
        int loopCount = Integer.valueOf(args[2]); //1000
        int inteval =  args.length >= 4 ? Integer.valueOf(args[3]) : 100; //1000
        
        String soapAction = "run";
        String msgFile = "/home/akira/mywork/devspace/java-samples/jaxb-datetime/jaxb-datetime-client/src/main/resources/msg_template.xml";
        
        System.out.println("----------------------------------------------");
        System.out.println("url:" + url);
        System.out.println("soapAction:" + soapAction);
        System.out.println("msgFile:" + msgFile);
        System.out.println("----------------------------------------------");

        byte[] fileContentBytes = Files.readAllBytes(Paths.get(msgFile));
        String fileContentStr = new String(fileContentBytes, StandardCharsets.UTF_8);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX"); 
        
        System.setProperty("http.keepAlive", "false");
        
        
        for (int i = 0; i < loopCount; i++) {
            
            // 送信メッセージの作成
            Date now = Calendar.getInstance().getTime();
            byte[] msg = String.format(fileContentStr, modelNum, sdf.format(now), modelNum).getBytes();
            
            URL oURL = new URL(url);
            HttpURLConnection con = (HttpURLConnection) oURL.openConnection();
            con.setUseCaches(false);
            con.setDoOutput(true);
            con.setDoInput(true);
            con.setRequestMethod("POST");
            con.setRequestProperty("Content-type", "text/xml; charset=utf-8");
            con.setRequestProperty("SOAPAction", soapAction);
            
            // 送受信
            long start = System.currentTimeMillis();
            OutputStream reqStream = con.getOutputStream();
            reqStream.write(msg);
            InputStream resStream = con.getInputStream();
            long end = System.currentTimeMillis();
            
            // 送受信時間
            System.out.println(end - start);

            con.disconnect();
            
            // 100ミリ間隔
            Thread.sleep(inteval);

        }

    }

}
