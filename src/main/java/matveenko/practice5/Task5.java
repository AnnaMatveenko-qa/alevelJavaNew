package matveenko.practice5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*
Найти максимальное значение в двухмерном массиве
 */
public class Task5 {
    public static void main(String[] args) {
        int[][] numbers = new int[5][5];
        fill(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
       }
        System.out.println("Max value: " + findMaxElement(numbers));
    }


    public static void fill(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextInt(-100, 100);

            }

        }
    }

    public static int findMaxElement(int[][] array) {
        Integer max = null;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max == null || max < array[i][j]) {
                    max = array[i][j];
                }
            }

        }
        return max;
    }
}
