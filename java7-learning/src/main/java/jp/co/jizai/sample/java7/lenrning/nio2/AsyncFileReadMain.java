package jp.co.jizai.sample.java7.lenrning.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.EnumSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by akira on 14/07/11.
 * http://d.hatena.ne.jp/Yosuke_Taka/20130429/1367226363
 * http://www.ibm.com/developerworks/jp/java/library/j-nio2-1/
 * http://stackoverflow.com/questions/15242804/how-does-jdk-7-implement-nio2-on-linux
 */
public class AsyncFileReadMain {

    private static final int LINE_SIZE = 10;

    private static final int READ_BUFFER_SIZE = 14;

    public static void main(String[] args) throws IOException,
            InterruptedException, ExecutionException {
    	
        final Path path = Paths.get("******/java7-learning/src/main/resources/xyz.txt");
        ExecutorService executorService = Executors.newFixedThreadPool(LINE_SIZE);
        try (AsynchronousFileChannel channel = AsynchronousFileChannel.open(
                path, EnumSet.of(StandardOpenOption.READ), executorService)) {
            System.out.println("Start to read");
            ByteBuffer[] buffers = new ByteBuffer[LINE_SIZE];
            Future<Integer>[] futures = new Future[LINE_SIZE];
            for (int i = 0, position = 0; i < LINE_SIZE; i++, position += READ_BUFFER_SIZE) {
                buffers[i] = ByteBuffer.allocate(READ_BUFFER_SIZE);
                futures[i] = channel.read(buffers[i], position);
            }

            for (int i = 0; i < LINE_SIZE; i++) {
                Integer readByteSize = futures[i].get();
                System.out.println("Read bytes : " + readByteSize + " Read message : " + new String(buffers[i].array()));
            }

        }
        executorService.shutdown();
        executorService.shutdownNow();
    }

}
