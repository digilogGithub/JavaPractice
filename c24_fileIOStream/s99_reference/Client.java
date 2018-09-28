package c24_fileIOStream.s99_reference;

import java.io.File;
import java.io.IOException;

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
        CompositeDirectoryHandling compositeDirectoryHandling = new CompositeDirectoryHandling(file, "");
        compositeDirectoryHandling.showDemo();
    }
}


