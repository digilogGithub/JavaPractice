package c24_fileIOStream.s01_introFileIO;

import java.io.*;

class BufferStreamCopy {
    public void showDemo() throws IOException {
/*        InputStream input = new FileInputStream("src\\c24_fileIOStream\\ioTestFile\\dog.jpg");
        OutputStream out = new FileOutputStream("src\\c24_fileIOStream\\ioTestFile\\dogClone.jpg");

        BufferedInputStream bufIn = new BufferedInputStream(input);
        BufferedOutputStream bufOut = new BufferedOutputStream(out);*/

        InputStream bufIn = new BufferedInputStream(new FileInputStream("src\\c24_fileIOStream\\ioTestFile\\dog.jpg"));
        OutputStream bufOut = new BufferedOutputStream(new FileOutputStream("src\\c24_fileIOStream\\ioTestFile\\dogClone.jpg"));

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
