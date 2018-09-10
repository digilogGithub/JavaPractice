package c23_thread.s03_ThreadSynchronized;

class NewsPaterStory {
    public void showDemo() {
        NewsPaper newsPaper = new NewsPaper();
        NewsReader newsReader1 = new NewsReader(newsPaper);
        NewsReader newsReader2 = new NewsReader(newsPaper);
        NewsWriter newsWriter = new NewsWriter(newsPaper);

        try {
            newsReader1.start();
            newsReader2.start();
            Thread.sleep(1000);

            newsWriter.start();

            newsReader1.join();
            newsReader2.join();
            newsWriter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
