package ua.matveenko.hw4;
/*Заполнить одномерный массив случайными целочисленными значениями.
• Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива -
400 элементов.
P.S. значения элементов можно ограничить значениями 1-10 включительно.*/

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[400];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Arithmetical mean: " + arithmeticalMean(array));
        System.out.println("Geometric mean: " + geometricMean(array));
         }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 11);
        }
    }

    public static double arithmeticalMean(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    public static double geometricMean(int[] array) {
        double productOfNumbers = 1;
        for (int i : array) {
            productOfNumbers *= i;
        }
        return Math.pow(productOfNumbers, (double) 1 / array.length);
    }
}




