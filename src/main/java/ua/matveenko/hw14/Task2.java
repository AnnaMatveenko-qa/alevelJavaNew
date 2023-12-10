package ua.matveenko.hw14;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        Integer[] numbers = new Integer[10];
        fillArray(numbers);
        Integer[] result1 = Arrays.copyOfRange(numbers, 0, numbers.length / 2);
        Integer[] result2 = Arrays.copyOfRange(numbers, numbers.length / 2, numbers.length);
        System.out.println(Arrays.toString(numbers));
        SimpleThread thread1 = new SimpleThread(result1);
        SimpleThread thread2 = new SimpleThread(result2);
        thread1.start();
        thread1.join();
        thread2.start();
        thread2.join();
        System.out.println("Number of simple numbers: " + (thread1.getSum() + thread2.getSum()));
    }

    public static void fillArray(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 10);
        }
    }
}

