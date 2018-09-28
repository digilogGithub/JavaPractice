package c24_fileIOStream.s99_reference;

import java.io.File;
import java.util.Arrays;
import java.util.List;

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
