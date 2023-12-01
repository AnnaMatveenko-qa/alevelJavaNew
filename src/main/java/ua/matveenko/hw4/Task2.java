package ua.matveenko.hw4;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*Заполнить одномерный массив случайными целочисленными значениями.
• Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.*/
public class Task2 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        fillArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Number of simple numbers: " + numberOfPrimeNumbers(numbers));
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 100);
        }
    }

    public static boolean checkNum(int number) {
        boolean check = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }


    public static int numberOfPrimeNumbers(int[] array) {
        int quantityOfNumbers = 0;
        for (int i : array) {
            boolean check = checkNum(i);
            if (check && array[i] != 1) {
                quantityOfNumbers++;
            }
        }
        return quantityOfNumbers;
    }
}
