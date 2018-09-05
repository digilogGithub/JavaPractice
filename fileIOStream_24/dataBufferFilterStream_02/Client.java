package fileIOStream_24.dataBufferFilterStream_02;

import java.io.*;

class Client {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("src\\fileIOStream_24\\ioTestFile\\data.bin");
        BufferedOutputStream bufOut = new BufferedOutputStream(out);
        DataOutputStream dataFilterOut = new DataOutputStream(bufOut);

        dataFilterOut.writeInt(275);
        dataFilterOut.writeDouble(45.79);

        dataFilterOut.close();

        InputStream in = new FileInputStream("src\\fileIOStream_24\\ioTestFile\\data.bin");
        BufferedInputStream bufIn = new BufferedInputStream(in);
        DataInputStream dataFilterIn = new DataInputStream(bufIn);

        int num1 = dataFilterIn.readInt();
        double num2 = dataFilterIn.readDouble();

        dataFilterIn.close();

        System.out.println(num1);
        System.out.println(num2);

        File file = new File("src\\fileIOStream_24\\ioTestFile\\data.bin");
        if (file.exists())
            file.delete();

    }
}
