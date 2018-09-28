package c24_fileIOStream.s99_reference;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

class FileCopy {
    public void showDemo() throws IOException {
        File src = new File("src\\c24_fileIOStream\\ioTestFile\\dog.jpg");
        File dst = new File("src\\c24_fileIOStream\\ioTestFile\\dogClone.jpg");

        Files.copy(src.toPath(), dst.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
}
