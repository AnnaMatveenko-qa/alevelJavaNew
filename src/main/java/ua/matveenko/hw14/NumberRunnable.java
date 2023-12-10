package ua.matveenko.hw14;

public class NumberRunnable {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 49; i > -1; i--) {
            Thread thread = new Thread(new UseRunnable(i));
            thread.start();
            thread.join();
        }
    }
}