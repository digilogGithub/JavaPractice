package c24_fileIOStream.s05_RandomAccessAndFileClass;

import java.io.File;
import java.io.IOException;

class FileMove {
    public void showDemo() throws IOException {
        File myFile = new File("src" + File.separator + "c24_fileIOStream" + File.separator + "ioTestFile" + File.separator + "randomFile.txt");
        if (!myFile.exists()) {
            System.out.println("원본 파일이 준비되어 있지 않습니다.");
            return;
        }

        /*Path file = Paths.get("c/text.txt");
        Path movePath = Paths.get("c:/TEMP/");
        Files.move(file , movePath .resolve(file .getFileName()));*/


        File reDir = new File("src" + File.separator + "c24_fileIOStream" + File.separator + "ioTestFile" + File.separator + "checkDir");
        if (!reDir.exists())
            reDir.mkdir();
        File reFile = new File(reDir, myFile.getName());
        myFile.renameTo(reFile);
        if (reFile.exists())
            System.out.println("파일 이동에 성공하였습니다.");
        else
            System.out.println("파일 이동에 실패하였습니다.");
    }
}
