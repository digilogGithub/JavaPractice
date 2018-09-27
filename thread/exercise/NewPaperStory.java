package thread.exercise;

public class NewPaperStory {
    public void showDemo() {
        NewsPaper newsPaper = new NewsPaper();
        NewsReader newsReader1 = new NewsReader(newsPaper);
        NewsReader newsReader2 = new NewsReader(newsPaper);
        NewsWriter newsWriter = new NewsWriter(newsPaper);

        newsReader1.start();
        newsReader2.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        newsWriter.start();

    }
}
