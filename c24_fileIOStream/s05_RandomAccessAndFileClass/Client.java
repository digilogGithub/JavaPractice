package c24_fileIOStream.s05_RandomAccessAndFileClass;

import java.io.IOException;

class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("RandomFileReadWrite");
        RandomFileReadWrite randomFileReadWrite = new RandomFileReadWrite();
        randomFileReadWrite.showDemo();

        System.out.println();
        System.out.println("FileMove");
        FileMove fileMove = new FileMove();
        fileMove.showDemo();

        System.out.println();
        System.out.println("FileMove");
        ListFileDirectoryInfo listFileDirectoryInfo = new ListFileDirectoryInfo();
        listFileDirectoryInfo.showDemo();
    }
}

