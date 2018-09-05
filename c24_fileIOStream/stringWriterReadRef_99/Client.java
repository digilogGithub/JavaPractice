package c24_fileIOStream.stringWriterReadRef_99;

import java.io.*;
import java.nio.charset.Charset;

class Client {
    public static void main(String[] args) throws IOException {

        String str;
        str = "테스트1\n테스트2\n테스트3";
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src\\c24_fileIOStream\\ioTestFile\\string.txt"), Charset.forName("UTF-8")));
        out.write(str);
        out.close();

        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("src\\c24_fileIOStream\\ioTestFile\\string.txt"), Charset.forName("UTF-8")));
        while (true) {
            str = in.readLine();
            if (str == null)
                break;
            System.out.println(str);
        }
        in.close();
    }
}



