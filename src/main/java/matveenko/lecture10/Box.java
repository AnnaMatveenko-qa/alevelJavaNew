package matveenko.lecture10;

import java.util.Arrays;

public class Box {
    private int[] numbers;
    public Box(int size){
        numbers = new int[size];
    }

    @Override
    public String toString() {
        return "Box{" +
                "numbers=" + Arrays.toString(numbers) +
                '}';
    }

    public Box() {
    }
}
