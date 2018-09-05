package fileIOStream_24.myTest;

import java.io.File;

class Client {
    public static void main(String[] args) {

        File file = new File("src" + File.separator + "fileIOStream_24");

        System.out.println("ROOT : " + file.getAbsolutePath());
        DiretoryComponent diretoryComponent = new DiretoryComponent(file, "");
        diretoryComponent.showProperty();
    }
}

