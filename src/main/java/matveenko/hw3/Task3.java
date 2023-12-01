package matveenko.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        String result = removeDoubleSpaces(text);
        String resultTrimString = trimString(result);
        int numberOfWordsSentence = countWord(resultTrimString);
        System.out.println(numberOfWordsSentence);

    }

    public static String removeDoubleSpaces(String inputString) {
        final String STRING_TO_REMOVE = "  ";
        while (inputString.contains(STRING_TO_REMOVE)) {
            inputString = inputString.replaceAll(STRING_TO_REMOVE, " ");
        }
        return inputString;
    }

    public static String trimString(String inputString) {
        return inputString.trim();
    }

    public static int countWord(String inputString) {
        return inputString.split(" ").length;
    }
}
