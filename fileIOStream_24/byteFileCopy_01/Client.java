package fileIOStream_24.byteFileCopy_01;

import java.io.*;

class Client {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("src\\fileIOStream_24\\ioTestFile\\dog.jpg");
        OutputStream out = new FileOutputStream("src\\fileIOStream_24\\ioTestFile\\dogClone.jpg");

        int copyByte = 0;
        int bData;

        while (true) {
            bData = in.read();
            if (bData == -1)
                break;
            out.write(bData);
            copyByte++;
        }

        in.close();
        out.close();
        System.out.println("Total Copy Byte : " + copyByte);
//        System.out.println(System.getProperty("user.dir"));
    }
}
