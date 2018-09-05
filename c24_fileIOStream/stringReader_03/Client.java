package c24_fileIOStream.stringReader_03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Client {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("src\\c24_fileIOStream\\ioTestFile\\string.txt"));

        String strIn;
        while (true) {
            strIn = in.readLine();
            if (strIn == null)
                break;
            System.out.println(strIn);
        }
        in.close();
    }
}
