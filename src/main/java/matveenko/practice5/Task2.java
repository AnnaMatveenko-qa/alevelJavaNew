package matveenko.practice5;

import java.util.Arrays;

/* Удаление из массива k-го элемента со сдвигом всех расположеных справа от него элементов
на одну позицию влево
 */
public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int indexToRemove = 4;
        System.out.println("Before: " + Arrays.toString(numbers));
        System.out.println(Arrays.toString(removeElement(numbers, indexToRemove)));
        System.out.println("After: " + Arrays.toString(numbers));
        System.out.println(Arrays.toString(removeElementAlternative(numbers, indexToRemove)));
    }
    public static int[] removeElementAlternative (int[] array, int indexToRemove){
        int[] modified = new int[array.length-1];
        System.arraycopy(array,0,modified,0,indexToRemove);
        System.arraycopy(array,indexToRemove+1, modified, indexToRemove, modified.length-indexToRemove);
        return modified;
    }
    public static int[] removeElement (int[] array, int indexToRemove){
        int[] modified = new int[array.length-1];
        int j =0;
        for (int i = 0; i < array.length; i++) {
            if (indexToRemove != i){
                modified[j++] = array[i];
            }

        }return modified;
    }
}
