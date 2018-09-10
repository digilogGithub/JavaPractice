package c23_thread.s04_ThreadNewSynchronized;

import java.util.Scanner;

class StringReader extends Thread {
    StringComm stringComm;

    public StringReader(StringComm stringComm) {
        this.stringComm = stringComm;
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);
        String readStr;

        for (int i = 0; i < 3; i++) {
            readStr = scanner.nextLine();
            stringComm.setNewString(readStr);
        }
    }
}
