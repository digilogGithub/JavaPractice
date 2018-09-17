package c24_fileIOStream.s99_reference;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("FileCopy");
        FileCopy fileCopy = new FileCopy();
        fileCopy.showDemo();

        System.out.println();
        System.out.println("StringWriterReader");
        StringWriterReader stringWriterReader = new StringWriterReader();
        stringWriterReader.showDemo();

        System.out.println();
        System.out.println("CompositeDirectoryHandling");
        File file = new File("src" + File.separator + "c24_fileIOStream");
        System.out.println("ROOT : " + file.getAbsolutePath());
        CompositeDirectoryHandling compositeDirectoryHandling = new CompositeDirectoryHandling(new File("src" + File.separator + "c24_fileIOStream"), "");
        compositeDirectoryHandling.showDemo();
    }
}


class FileCopy {
    public void showDemo() throws IOException {
        File src = new File("src\\c24_fileIOStream\\ioTestFile\\dog.jpg");
        File dst = new File("src\\c24_fileIOStream\\ioTestFile\\dogClone.jpg");

        Files.copy(src.toPath(), dst.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}

class StringWriterReader {
    public void showDemo() throws IOException {
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

class CompositeDirectoryHandling {

    List<File> fileList;
    File file;
    String tab;

    CompositeDirectoryHandling(File file, String tab) {
        this.tab = tab;
        this.file = file;
        fileList = Arrays.asList(file.listFiles());
    }


    void showDemo() {
        for (File file : fileList) {
            if (file.isDirectory()) {
                System.out.println(tab + file.getName() + "(Directory)");
                CompositeDirectoryHandling directoryComponent = new CompositeDirectoryHandling(file, tab + "\t");
                directoryComponent.showDemo();
            } else
                System.out.println(tab + file.getName() + "(File)");
        }
    }
}