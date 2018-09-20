package c24_fileIOStream.s03_ChracterStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class StringReader {
    public void showDemo() throws IOException {
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
