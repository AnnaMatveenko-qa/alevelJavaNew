package ua.matveenko.hw14;


import lombok.Getter;

import java.util.Arrays;


public class SimpleThread extends Thread {
    Integer[] numbers;

    @Getter
    Integer sum;

    public SimpleThread(Integer[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        System.out.println(sum = numberOfPrimeNumbers(numbers));
    }

    private static boolean checkNum(int number) {
        boolean isPrime = number > 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number <= 1 || number % 2 == 0 || number % 3 == 0 || number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


    private Integer numberOfPrimeNumbers(Integer[] array) {
        System.out.println(Arrays.toString(array));
        int quantityOfNumbers = 0;
        for (int i : array) {
            if (checkNum(i)) {
                quantityOfNumbers++;
            }
        }
        return quantityOfNumbers;
    }

    @Override
    public String toString() {
        return "SimpleThread{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }
}

