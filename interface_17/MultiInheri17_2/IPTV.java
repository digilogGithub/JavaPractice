package interface_17.MultiInheri17_2;

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
