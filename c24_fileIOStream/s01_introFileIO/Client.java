package c24_fileIOStream.s01_introFileIO;

import java.io.*;

class Client {
    public static void main(String[] args) throws IOException {

/*        System.out.println("ByteFileCopy");
        ByteFileCopy byteFileCopy = new ByteFileCopy();
        byteFileCopy.showDemo();

        System.out.println();
        System.out.println("BufferFileCopy");
        BufferFileCopy bufferFileCopy = new BufferFileCopy();
        bufferFileCopy.showDemo();*/

        System.out.println();
        System.out.println("BufferStreamCopy");
        BufferStreamCopy bufferStreamCopy = new BufferStreamCopy();
        bufferStreamCopy.showDemo();

    }
}


