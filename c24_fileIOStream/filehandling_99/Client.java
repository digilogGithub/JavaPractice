package c24_fileIOStream.filehandling_99;

import java.io.File;

class Client {
    public static void main(String[] args) {

        File file = new File("src" + File.separator + "c24_fileIOStream");

        System.out.println("ROOT : " + file.getAbsolutePath());
        DiretoryComponent diretoryComponent = new DiretoryComponent(file, "");
        diretoryComponent.showProperty();
    }
}

