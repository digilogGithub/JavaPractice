package c24_fileIOStream.dataBufferFilterStream_02;

import java.io.*;

class Client {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("src\\c24_fileIOStream\\ioTestFile\\data.bin");
        BufferedOutputStream bufOut = new BufferedOutputStream(out);
        DataOutputStream dataFilterOut = new DataOutputStream(bufOut);

        dataFilterOut.writeInt(275);
        dataFilterOut.writeDouble(45.79);

        dataFilterOut.close();

        InputStream in = new FileInputStream("src\\c24_fileIOStream\\ioTestFile\\data.bin");
        BufferedInputStream bufIn = new BufferedInputStream(in);
        DataInputStream dataFilterIn = new DataInputStream(bufIn);

        int num1 = dataFilterIn.readInt();
        double num2 = dataFilterIn.readDouble();

        dataFilterIn.close();

        System.out.println(num1);
        System.out.println(num2);

        File file = new File("src\\c24_fileIOStream\\ioTestFile\\data.bin");
        if (file.exists())
            file.delete();

    }
}
