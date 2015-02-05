package jp.co.jizai.sample.java7.lenrning.nio2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by akira on 14/07/11.
 */
public class AsyncFileWriteMain {



    private static final int LINE_SIZE = 10;

    public static void main(String[] args) throws IOException {

        final Path path = Paths.get("/tmp/xyz.txt");
        if (Files.exists(path)) {
            Files.delete(path);
        }

        try (AsynchronousFileChannel channel = AsynchronousFileChannel.open(
                path, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            System.out.println("Start to write");
            final CompletionHandler<Integer, String> handler = new CompletionHandlerImpl();
            for (int i = 0, position = 0; i < LINE_SIZE; i++) {
                final String message = "Hello World-" + Integer.toString(i) + "\n";
                // Buffer、書き込み位置、アタッチメント、ハンドラを与えて書き込み処理実行
                channel.write(ByteBuffer.wrap(message.getBytes()), position, getAttachment(i), handler);
                // 次にメッセージを書き込む位置を設定
                position += message.length();
            }

        }
    }

    /*
     * Attachmentはサンプルなので適当なメッセージを返す。
     */
    private static String getAttachment(int i) {
        return (i + 1) == 1 ? Integer.toString(i + 1) + " time" : Integer.toString(i + 1) + " times";
    }

    private static final class CompletionHandlerImpl implements CompletionHandler<Integer, String> {

        @Override
        public void completed(Integer result, String attachment) {
            System.out.println("[Completed to write] Current thread : " + Thread.currentThread().getId() + " Attachment : " + attachment + " Written bytes : " + result);
        }

        @Override
        public void failed(Throwable e, String attachment) {
            System.out.println("[Failed to write] Current thread : " + Thread.currentThread().getId() + " Attachment : " + attachment + " Exception : " + e);

        }

    }
}
