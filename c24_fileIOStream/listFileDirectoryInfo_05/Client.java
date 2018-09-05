package c24_fileIOStream.listFileDirectoryInfo_05;

import java.io.File;
import java.util.Arrays;
import java.util.List;

class Client {
    public static void main(String[] args) {

        File myDir = new File("src" + File.separator + "c24_fileIOStream");
        List<File> fileList = Arrays.asList(myDir.listFiles());

        for (File file : fileList) {
            System.out.println(file.getName());
            if (file.isDirectory())
                System.out.println("\t \t DIR");
            else
                System.out.println("\t \t FILE");
        }
    }
}
