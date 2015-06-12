package spec;

/**
 * Oracle Solaris Studio のパフォーマンスアナライザスレッドが
 * Sleep状態時にタイムラインのCPU状態表示を確かめるためのサンプル.
 */
public class SleepTest {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 30; i++) {
            String a = "";

            for (int j = 0; j < 30000; j++) {
                a = a + j;

            }
            System.out.printf("" + i);

            Thread.sleep(2 * 1000);
        }

    }
}
