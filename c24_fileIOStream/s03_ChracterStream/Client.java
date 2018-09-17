package c24_fileIOStream.s03_ChracterStream;

import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println();
        System.out.println("StringWriter");
        StringWriter stringWriter = new StringWriter();
        stringWriter.showDemo();

        System.out.println("StringReader");
        StringReader stringReader = new StringReader();
        stringReader.showDemo();
    }
}

