package server.nio;

import java.nio.IntBuffer;

public class BasicBuffer {
    public static void main(String[] args) {
        IntBuffer allocate = IntBuffer.allocate(5);

        for (int i = 0; i < allocate.capacity(); i++) {
                allocate.put(i);
        }

        allocate.flip();

        while (allocate.hasRemaining()){
            System.out.println(allocate.get());
        }
    }
}
