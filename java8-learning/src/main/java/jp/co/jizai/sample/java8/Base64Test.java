package jp.co.jizai.sample.java8;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Base64;

public class Base64Test {
	public static void main(String[] args) throws UnsupportedEncodingException {

//		System.out.println(new String(Base64.getEncoder().encode("あきら".getBytes("UTF-8"))) );
//		//System.out.println(new String(Base64.getUrlEncoder().encode("あきら".getBytes())) );
//		
//		
//		System.out.println(new String(Base64.getDecoder().decode("Qk2JOmFhYWE="), "UTF-8"));
//		//System.out.println(new String(Base64.getDecoder().decode("44GC44GN44KJ"), "UTF-8"));
//		System.out.println(new String(Base64.getDecoder().decode("YWtpcmE6YWFhYWE=")));
		
		//System.out.println(URLDecoder.decode("%E3%81%82%E3%81%8D%E3%82%89", "UTF-8"));
		
		//System.out.println(new String(Base64.getUrlEncoder().encode("あきら001".getBytes())) );
		System.out.println(URLEncoder.encode("あきらaaa", "UTF-8"));
		System.out.println(new String(Base64.getEncoder().encode("あきらaaa".getBytes("UTF-8"))));
		
		//%E3 %81 %82
		//%E3 %81 %8D
		//%E3 %82 %89
//		System.out.println(URLEncoder.encode("あきらaaa", "Shift_JIS"));
//		System.out.println(URLEncoder.encode("ウィキペディア", "Shift_JIS"));
//		System.out.println(URLEncoder.encode("ウィキペディア", "UTF-8"));
//		
	}
}
