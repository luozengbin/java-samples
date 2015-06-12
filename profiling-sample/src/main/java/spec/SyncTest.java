package spec;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

/**
 * Created by akira on 15/02/05.
 */
public class SyncTest {


    public static void main(String[] args) {

        final int numberOfThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService pool = Executors.newFixedThreadPool(numberOfThreads);

        Set<Future> set = new HashSet<Future>();
        for (int i = 0; i < numberOfThreads; i++) {
            Callable callable = new MyTask();
            Future future = pool.submit(callable);
            set.add(future);
        }

        for (Future future : set) {
            Object result = null;
            try {
                result = future.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }


    static class MyTask implements Callable {

        @Override
        public Object call() throws Exception {

            System.out.println(Thread.currentThread() + " --> running");

            Thread.sleep(500);
            SyncTest.singlepoint();


            String z = "";
            for (int j = 0; j < 50000; j++) {
                z = z + j;
            }

            System.out.println(Thread.currentThread() + " --> end");

            return "done";
        }
    }

    public synchronized static void singlepoint() throws InterruptedException {

        System.out.println(Thread.currentThread() + " --> in");
        String a = "";
        for (int i = 0; i < 50000; i++) {
            a = a + i;
        }

        System.out.println("sleep");

        Thread.sleep(1 * 1000);

        for (int i = 0; i < 50000; i++) {
            a = a + i;
        }

        System.out.println(Thread.currentThread() + " --> out");

    }


}
