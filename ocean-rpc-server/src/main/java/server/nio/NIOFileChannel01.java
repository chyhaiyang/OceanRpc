package server.nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.FileChannel;

public class NIOFileChannel01 {
    public static void main(String[] args) throws IOException {
        String s = "hello world";
        FileOutputStream fileOutputStream = new FileOutputStream("./hello.txt");
        FileChannel channel = fileOutputStream.getChannel();
        ByteBuffer allocate = ByteBuffer.allocate(1024);

        allocate.put(s.getBytes());

        allocate.flip();

        int write = channel.write(allocate);
        fileOutputStream.close();
    }
}
