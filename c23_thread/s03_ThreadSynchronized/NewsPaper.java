package c23_thread.s03_ThreadSynchronized;

class NewsPaper {
    /*
    // No Sequence Synchronized
    String todayNews;

    public String getTodayNews() {
        return todayNews;
    }

    public void setTodayNews(String todayNews) {
        this.todayNews = todayNews;
    }
    */

    String todayNews;
    boolean isTodayNews = false;

    public String getTodayNews() {
        if (isTodayNews == false) {
            try {
                synchronized (this) {
                    wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isTodayNews = false;
        return todayNews;
    }

    public void setTodayNews(String todayNews) {
        this.todayNews = todayNews;
        isTodayNews = true;

        synchronized (this) {
            notifyAll();
        }
    }
}
