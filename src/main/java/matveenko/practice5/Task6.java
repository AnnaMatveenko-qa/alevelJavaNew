package matveenko.practice5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*
Найти сумму элементов главной диагонали массива
 */
public class Task6 {
    public static void main(String[] args) {
        double[][] numbers = new double[4][3];
        fill(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(Arrays.toString(numbers[i]));

        }
        System.out.println("Sum diagonal: " + calcDiagonalSum(numbers));
    }

    public static void fill(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ThreadLocalRandom.current().nextDouble(1, 10);

            }

        }
    }
    public static double calcDiagonalSum(double[][] numbers){
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(i==j){
                    sum +=numbers[i][j];
                }

            }

        }
        return sum;
    }
}
