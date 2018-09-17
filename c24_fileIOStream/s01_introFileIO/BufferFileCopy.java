package c24_fileIOStream.s01_introFileIO;

import java.io.*;

class BufferFileCopy {
    public void showDemo() throws IOException {
        InputStream in = new FileInputStream("src\\c24_fileIOStream\\ioTestFile\\dog.jpg");
        OutputStream out = new FileOutputStream("src\\c24_fileIOStream\\ioTestFile\\dogClone.jpg");

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
