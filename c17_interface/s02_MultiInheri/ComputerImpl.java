package c17_interface.s02_MultiInheri;

public class ComputerImpl implements Computer {
    @Override
    public void dataReceive() {
        System.out.println("영상 데이터 수신 중");
    }
}
