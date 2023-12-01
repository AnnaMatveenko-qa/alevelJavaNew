package matveenko.hw5;
//Проверить заданный массив на упорядоченность по убыванию.

import java.util.Arrays;


public class Task2 {
    public static void main(String[] args) {
        int[][] numbers = {{10, 9, 8, 7}, {5, 4, 3, 13}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }
        boolean result = checkDescending(numbers);
        System.out.println("descending check: " + result);
    }


    public static int[] copyTwoToOneArray(int[][] numbers) {
        int[] array = new int[numbers[0].length * numbers.length];
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                array[count++] = numbers[i][j];
            }
        }
        return array;
    }

    public static boolean checkDescending(int[][] number) {
        int[] array = copyTwoToOneArray(number);
        boolean result = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}





