package c24_fileIOStream.filehandling_99;

import java.io.File;
import java.util.Arrays;
import java.util.List;

class DiretoryComponent {

    List<File> fileList;
    File file;
    String tab;

    DiretoryComponent(File file, String tab) {
        this.tab = tab;
        this.file = file;
        fileList = Arrays.asList(file.listFiles());
    }

    void showProperty() {
        for (File file : fileList) {
            if (file.isDirectory()) {
                System.out.println(tab + file.getName() + "(Directory)");
                DiretoryComponent diretoryComponent = new DiretoryComponent(file, tab + "\t");
                diretoryComponent.showProperty();
            } else
                System.out.println(tab + file.getName() + "(File)");
        }
    }
}
