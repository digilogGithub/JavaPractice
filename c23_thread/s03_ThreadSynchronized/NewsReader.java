package c23_thread.s03_ThreadSynchronized;

class NewsReader extends Thread {
    NewsPaper newsPaper;

    public NewsReader(NewsPaper newsPaper) {
        this.newsPaper = newsPaper;
    }

    public NewsPaper getNewsPaper() {
        return newsPaper;
    }

    public void run() {
        System.out.println("오늘의 뉴스 : " + newsPaper.getTodayNews());
        System.out.println();
    }
}
