package thread.exercise;

public class NewsWriter extends Thread {
    NewsPaper newsPaper;

    public NewsWriter(NewsPaper newsPaper) {
        this.newsPaper = newsPaper;
    }

    @Override
    public void run() {
        newsPaper.setNewsContent("집을 사겠다는 사람은 많은데 매물은 없어, 지금 서울 부동산 시장은 그야말로 '부르는 게 값'인데요.\\n\" +\n" +
                "                \"매도자의 유리한 정도를 나타내는 매수우위지수가 역대 최고치를 기록했습니다.\\n\" +\n" +
                "                \"정부는 이르면 이번 주 안에 부동산 종합대책을 발표할 예정입니다.\\n\" +\n" +
                "                \"보도에 모은희 기자입니다");
    }
}
