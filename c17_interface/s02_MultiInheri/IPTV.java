package c17_interface.s02_MultiInheri;

public class IPTV extends TV implements Computer {
    ComputerImpl computerImpl = new ComputerImpl();

    void powerON() {
        dataReceive();
        super.onTV();
    }

    @Override
    public void dataReceive() {
        computerImpl.dataReceive();
    }
}
