package server.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOFileChannel03 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("./hello.txt");
        FileInputStream fileInputStream = new FileInputStream(inputFile);
        FileChannel fileInputStreamChannel = fileInputStream.getChannel();

        File outputFile = new File("olleh.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(outputFile);
        FileChannel fileOutputStreamChannel = fileOutputStream.getChannel();

        ByteBuffer allocate = ByteBuffer.allocate(512);

        while (true){
            allocate.clear();
            int read = fileInputStreamChannel.read(allocate);
            if (read == -1){
                break;
            }
            allocate.flip();
            fileOutputStreamChannel.write(allocate);


        }

        fileInputStreamChannel.close();
        fileInputStreamChannel.close();


    }
}
