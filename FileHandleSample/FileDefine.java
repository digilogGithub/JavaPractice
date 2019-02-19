package FileHandleSample;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

public class FileDefine {

    File file = new File("C:\\Users\\POC\\Documents\\TEST_ODS");
    List<File> fileList = Arrays.asList(file.listFiles());
    BufferedReader in;
    String str;
    BufferedWriter out;

    public void showDemo() throws IOException {
        out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\POC\\Documents\\TEST\\output.csv"), Charset.forName("UTF-8")));
        str = "TOD,SEC,B200,B201,B202,B203,B204,B205,B206,B207,B208,B209,B20A,B20B,B20C,B20D,B20E,B20F,B210,B211,B212,B213,B214,B215,B216,B217,B218,B219,B21A,B21B,B21C,B21D,B21E,B21F,B220,B221,B222,B223,B224,B225,B226,B227,B228,B229,B22A,B22B,B22C,B22D,B22E,B22F,B230,B231,B232,B233,B234,B235,B236,B237,B238,B239,B23A,B23B,B23C,B23D,B23E,B23F";
        out.write(str);
        out.newLine();
        for (File file : fileList) {
            System.out.println(file.getAbsolutePath());
            in = new BufferedReader(new InputStreamReader(new FileInputStream(file.getAbsolutePath()), Charset.forName("UTF-8")));
            int i = 1;
            while (true) {
                str = in.readLine();
                if (str == null)
                    break;
                if (i > 7) {
                    out.write(str);
                    out.newLine();
                }
                i++;
            }
        }
        out.close();
//        String str;
//        str = "테스트1\n테스트2\n테스트3";
//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src\\c24_fileIOStream\\ioTestFile\\string.txt"), Charset.forName("UTF-8")));
//        out.write(str);
//        out.close();
//
//        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("src\\c24_fileIOStream\\ioTestFile\\string.txt"), Charset.forName("UTF-8")));
//        while (true) {
//            str = in.readLine();
//            if (str == null)
//                break;
//            System.out.println(str);
//        }
//        in.close();
    }
}
