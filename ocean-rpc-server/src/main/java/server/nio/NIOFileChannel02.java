package server.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileChannel02 {
    public static void main(String[] args) throws IOException {

        File file = new File("./hello.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        FileChannel channel = fileInputStream.getChannel();
        ByteBuffer allocate = ByteBuffer.allocate((int) file.length());
        channel.read(allocate);
        allocate.flip();
        for (int i = 0; i < allocate.capacity(); i++) {
            System.out.println(allocate.get());
        }
        fileInputStream.close();


    }
}
