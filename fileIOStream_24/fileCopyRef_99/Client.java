package fileIOStream_24.fileCopyRef_99;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

class Client {
    public static void main(String[] args) throws IOException {
        File src = new File("src\\fileIOStream_24\\ioTestFile\\dog.jpg");
        File dst = new File("src\\fileIOStream_24\\ioTestFile\\dogClone.jpg");

        Files.copy(src.toPath(), dst.toPath(), StandardCopyOption.REPLACE_EXISTING);

    }
}
