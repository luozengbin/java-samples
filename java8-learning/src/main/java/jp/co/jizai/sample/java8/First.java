package jp.co.jizai.sample.java8;

import java.util.function.Function;

/**
 * Created by akira on 14/09/26.
 */
public class First {
	public static void main(String[] args) {
		Runnable runnable = () -> System.out.println("Hello world!");
		runnable.run();
		
		Function<Integer, String> func = (integerValue) -> String.format("引数に%dが渡されました。", integerValue.intValue());
		String result = func.apply(new Integer(1000));
		System.out.printf("result=%s", result);
		
	}
}
