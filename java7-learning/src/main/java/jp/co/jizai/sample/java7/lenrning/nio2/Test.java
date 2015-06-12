package jp.co.jizai.sample.java7.lenrning.nio2;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Test {
	public static void main(String[] args) throws UnsupportedEncodingException {

		System.out.println(URLEncoder1.encode("あきら", "UTF-8"));

		// UTF-8バイト表現を出力する
		byte[] bs = "あきら".getBytes("UTF-8");
		for (byte b : bs) {
			System.out.print(b);
			System.out.print(" | ");
		}
		System.out.print("\n");

		// 16進数表現を出力する
		for (byte b : bs) {
			System.out.println(Integer.toHexString(b));
		}
	}
}
