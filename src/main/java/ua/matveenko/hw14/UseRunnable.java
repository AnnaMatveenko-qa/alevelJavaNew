package ua.matveenko.hw14;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UseRunnable implements Runnable {

    private Integer number;

    @Override
    public void run() {
        System.out.println("Hello from thread: " + number);
    }
}

