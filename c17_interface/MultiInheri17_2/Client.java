package c17_interface.MultiInheri17_2;

public class Client {
    public static void main(String[] args) {
        IPTV iptv = new IPTV();
        System.out.println("IPTV");
        iptv.powerON();
        System.out.println();

        TV tv = iptv;
        System.out.println("TV");
        tv.onTV();

        Computer computer = iptv;
        System.out.println("COMPUTER");
        computer.dataReceive();
    }
}
