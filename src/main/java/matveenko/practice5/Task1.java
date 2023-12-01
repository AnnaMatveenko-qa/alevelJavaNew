package matveenko.practice5;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*Нахождение элементов массива с задаными свойствами
индекс элемента с минимальным значением
индекс элемента с махсимальным значением
значение элемента из середины массива
 */
public class Task1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        fillArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Min element Index: " + findMinElementIndex(numbers));
        System.out.println("Max element Index: " + findMaxElementIndex(numbers));
        System.out.println("Central element : " + findCentralElement(numbers));
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1, 50);
        }
    }

    public static int findMinElementIndex(int[] numbers) {
        int minIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[minIndex] > numbers[i]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findMaxElementIndex(int[] numbers) {
        int maxIndex = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[maxIndex] < numbers[i]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
    /**
     * If array length % 2 == 0, return left of two central elements
     * @param array
     * @return
     */
    public static int findCentralElement ( int[] array){
        int center = array.length / 2;
        if (array.length % 2 == 0){
            center--;
        }
        return array[center];
    }

}
