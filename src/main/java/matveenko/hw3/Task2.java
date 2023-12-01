package matveenko.hw3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        String result = stringWithoutSpaces(text);
        result = trimString(result);
        boolean isPalindrome = checkForPalindrome(result);
        boolean isPalindromeStringBuilder = checkForPalindromeStringBuilder(result);
        System.out.println(isPalindrome);
        System.out.println(isPalindromeStringBuilder);
    }

    public static String stringWithoutSpaces(String inputString) {
        return inputString.replace(" ", "");
    }

    public static String trimString(String inputString) {
        return inputString.trim();
    }

    public static Boolean checkForPalindrome(String inputString) {
        String resultString = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            resultString += inputString.charAt(i);
        }
        return inputString.equalsIgnoreCase(resultString);
    }

    public static Boolean checkForPalindromeStringBuilder(String inputString) {
        StringBuilder strBuilder = new StringBuilder(inputString);
        strBuilder.reverse();
        String invertedText = strBuilder.toString();
        return inputString.equalsIgnoreCase(invertedText);
    }
}
