package thread.exercise;

public class NewsReader extends Thread {
    NewsPaper newsPaper;

    public NewsReader(NewsPaper newsPaper) {
        this.newsPaper = newsPaper;
    }

    public NewsPaper getNewsPaper() {
        return newsPaper;
    }

    @Override
    public void run() {
        System.out.println("오늘의 뉴스 : " + newsPaper.getNewsContent());
        System.out.println();
    }
}
