package fileIOStream_24.bufferFileCopy_01;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("src\\fileIOStream_24\\ioTestFile\\dog.jpg");
        OutputStream out = new FileOutputStream("src\\fileIOStream_24\\ioTestFile\\dogClone.jpg");

        int copyByte = 0;
        int readLen;
        byte buf[] = new byte[1024];


        while (true) {
            readLen = in.read(buf);
            if (readLen == -1)
                break;
            out.write(buf, 0, readLen);
            copyByte += readLen;
        }

        in.close();
        out.close();
        System.out.println("Total Copy Byte : " + copyByte);
    }
}
