package fileIOStream_24.dataFilterStream_02;

import java.io.*;

class Client {
    public static void main(String[] args) throws IOException {
        OutputStream out = new FileOutputStream("src\\fileIOStream_24\\ioTestFile\\data.bin");
        DataOutputStream filterOut = new DataOutputStream(out);
        filterOut.writeInt(275);
        filterOut.writeDouble(45.79);
        filterOut.close();

        InputStream in = new FileInputStream("src\\fileIOStream_24\\ioTestFile\\data.bin");
        DataInputStream filterIn = new DataInputStream(in);
        int num1 = filterIn.readInt();
        double num2 = filterIn.readDouble();
        filterIn.close();

        File file = new File("src\\fileIOStream_24\\ioTestFile\\data.bin");
        if (file.exists())
            file.delete();

        System.out.println(num1);
        System.out.println(num2);

    }
}
