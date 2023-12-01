package matveenko.hw5;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][] numbers = new int[2][2];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
        int[][] array = swapRowsWithColumns(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
    }

    public static int[][] swapRowsWithColumns(int[][] numbers) {
        int[][] array = new int[numbers[0].length][numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                array[j][i] = numbers[i][j];

            }

        }
        return array;

    }
}
