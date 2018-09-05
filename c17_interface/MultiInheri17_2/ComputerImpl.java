package c17_interface.MultiInheri17_2;

public class ComputerImpl implements Computer {
    @Override
    public void dataReceive() {
        System.out.println("영상 데이터 수신 중");
    }
}
