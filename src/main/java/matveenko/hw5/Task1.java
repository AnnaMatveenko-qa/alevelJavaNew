package matveenko.hw5;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] numbers = new int[3][4];
        moduloTheElementsOfOddRows(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
    }

    public static void moduloTheElementsOfOddRows(int[][] array) {
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 0) {
                    array[i][j] = k;
                    k++;
                } else {
                    array[i][j] = -(k);
                    k++;
                }
            }
        }
    }
}

