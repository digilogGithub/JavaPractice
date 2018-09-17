package c24_fileIOStream.s02_filterStream;

import java.io.*;

class DataBufferFilterPerformance {
    public void showDemo() throws IOException {
        System.out.println("*** NO BufferedOutputStream ***");
        OutputStream outputStream1 = new FileOutputStream(("src\\c24_fileIOStream\\ioTestFile\\dataPerform1.bin"));
        DataOutputStream dataOutputStream1 = new DataOutputStream(outputStream1);
        performanceTest(dataOutputStream1);
        dataOutputStream1.close();

        System.out.println();
        System.out.println("*** Use BufferedOutputStream ***");
        OutputStream outputStream2 = new FileOutputStream(("src\\c24_fileIOStream\\ioTestFile\\dataPerform2.bin"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream2, 1024 * 10);
        DataOutputStream dataOutputStream2 = new DataOutputStream(bufferedOutputStream);
        performanceTest(dataOutputStream2);
        dataOutputStream2.close();
    }

    public void performanceTest(DataOutputStream dataOutputStream) throws IOException {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++)
                dataOutputStream.writeDouble(12.345);
        }

        dataOutputStream.flush();
        long endTime = System.currentTimeMillis();
        System.out.println("경과시간 : " + (endTime - startTime));
    }
}
