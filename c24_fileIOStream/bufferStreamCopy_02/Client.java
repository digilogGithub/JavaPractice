package c24_fileIOStream.bufferStreamCopy_02;

import java.io.*;

class Client {
    public static void main(String[] args) throws IOException {
        InputStream input = new FileInputStream("src\\c24_fileIOStream\\ioTestFile\\dog.jpg");
        OutputStream out = new FileOutputStream("src\\c24_fileIOStream\\ioTestFile\\dogClone.jpg");

        BufferedInputStream bufIn = new BufferedInputStream(input);
        BufferedOutputStream bufOut = new BufferedOutputStream(out);

        int bData;
        int copyByteSize = 0;

        while (true) {
            bData = bufIn.read();
            if (bData == -1)
                break;
            bufOut.write(bData);
            copyByteSize++;
        }

        bufIn.close();
        bufOut.close();

        System.out.println("Data size : " + copyByteSize);

    }
}
