package matveenko.practice5;

import java.util.Arrays;

/*
Проверка наличия в массиве одинаковых элементов
 */
public class Task4 {
    public static void main(String[] args) {
        String[] lines = {"public", "static", "void", "main", "Task4","public" };
        System.out.println("has duplicate: " + hasDuplicateUsingStreams(lines));
        System.out.println("has duplicate: " + hasDuplicateUsingLoop(lines));
        System.out.println("has duplicate: " + hasDuplicateUsingSort(lines));
    }

    public static boolean hasDuplicateUsingStreams(String[] lines) {
        return Arrays.stream(lines).distinct().count() != lines.length;
    }

    public static boolean hasDuplicateUsingLoop(String[] lines) {
        int uniqueElements = 0;
        for (int i = 0; i < lines.length; i++) {
            boolean isUnique = true;
            for (int j = i + 1; j < lines.length; j++) {
                if (lines[i].equals(lines[j])) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean hasDuplicateUsingSort(String[] lines) {
       String[] sorted = Arrays.copyOf(lines, lines.length);
       Arrays.sort(sorted);
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i].equals(sorted[i-1])){
                return true;
            }

        }
        return false;
    }
}