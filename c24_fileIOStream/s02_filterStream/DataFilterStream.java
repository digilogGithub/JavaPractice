package c24_fileIOStream.s02_filterStream;

import java.io.*;

class DataFilterStream {
    public void showDemo() throws IOException {
        OutputStream out = new FileOutputStream("src\\c24_fileIOStream\\ioTestFile\\data.bin");
        DataOutputStream filterOut = new DataOutputStream(out);
        filterOut.writeInt(275);
        filterOut.writeDouble(45.79);
        filterOut.close();

        InputStream in = new FileInputStream("src\\c24_fileIOStream\\ioTestFile\\data.bin");
        DataInputStream filterIn = new DataInputStream(in);
        int num1 = filterIn.readInt();
        double num2 = filterIn.readDouble();
        filterIn.close();

        File file = new File("src\\c24_fileIOStream\\ioTestFile\\data.bin");
        if (file.exists())
            file.delete();

        System.out.println(num1);
        System.out.println(num2);

    }
}
