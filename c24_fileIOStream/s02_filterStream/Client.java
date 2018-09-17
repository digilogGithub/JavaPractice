package c24_fileIOStream.s02_filterStream;

import java.io.*;

/*        System.out.println("DataFilterStream");
        DataFilterStream dataFilterStream = new DataFilterStream();
        dataFilterStream.showDemo();

        System.out.println();
        System.out.println("DataBufferFilterStream");
        DataBufferFilterStream dataBufferFilterStream = new DataBufferFilterStream();
        dataBufferFilterStream.showDemo();

        System.out.println();
        System.out.println("DataBufferFilterPerformance");
        DataBufferFilterPerformance bufferStreamCopy = new DataBufferFilterPerformance();
        bufferStreamCopy.showDemo();*/


class Client {
    public static void main(String[] args) throws IOException {

//        System.out.println("DataFilterStream");
//        DataFilterStream dataFilterStream = new DataFilterStream();
//        dataFilterStream.showDemo();
//
//        System.out.println();
//        System.out.println("DataBufferFilterStream");
//        DataBufferFilterStream dataBufferFilterStream = new DataBufferFilterStream();
//        dataBufferFilterStream.showDemo();

        System.out.println();
        System.out.println("DataBufferFilterPerformance");
        DataBufferFilterPerformance dataBufferFilterPerformance = new DataBufferFilterPerformance();
        dataBufferFilterPerformance.showDemo();


    }
}

