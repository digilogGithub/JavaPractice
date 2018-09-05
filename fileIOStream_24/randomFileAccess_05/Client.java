package fileIOStream_24.randomFileAccess_05;

import java.io.IOException;
import java.io.RandomAccessFile;

class Client {
    public static void main(String[] args) throws IOException {

        RandomAccessFile randomAccessFile = new RandomAccessFile("src\\fileIOStream_24\\ioTestFile\\randomFile.txt", "rw");
        System.out.println("write...........");
        System.out.printf("현재 입출력 위치 : %d 바이트 \n", randomAccessFile.getFilePointer());

//        randomAccessFile.writeUTF("200");
        randomAccessFile.writeInt(200);
        randomAccessFile.writeInt(500);
        System.out.printf("현재 입출력 위치 : %d 바이트 \n", randomAccessFile.getFilePointer());

        randomAccessFile.writeDouble(48.65);
        randomAccessFile.writeDouble(52.24);
        System.out.printf("현재 입출력 위치 : %d 바이트 \n", randomAccessFile.getFilePointer());
        System.out.println("Read......................");
        randomAccessFile.seek(0);
        System.out.printf("현재 입출력 위치 : %d 바이트 \n", randomAccessFile.getFilePointer());
        System.out.println(randomAccessFile.readInt());
        System.out.println(randomAccessFile.readInt());
        System.out.printf("현재 입출력 위치 : %d 바이트 \n", randomAccessFile.getFilePointer());

        System.out.println(randomAccessFile.readDouble());
        System.out.println(randomAccessFile.readDouble());
        System.out.printf("현재 입출력 위치 : %d 바이트 \n", randomAccessFile.getFilePointer());
        randomAccessFile.close();
    }
}
