package ua.matveenko.hw10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }

    public static List<Integer> getOddNumber(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                oddNumbers.add(numbers.get(i));
            }
        }
        return oddNumbers;
    }

    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> strings = new ArrayList<>();
        for (Integer number : numbers) {
            strings.add(number.toString());
        }
        return strings;
    }

    public static List<String> doubling(List<String> strings) {
        List<String> doublingStrings = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String newValue = strings.get(i) + strings.get(i);
            doublingStrings.add(newValue);
        }
        return doublingStrings;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.addAll(Arrays.asList(7, 10, 15, 25, 17));
        System.out.println(numbers);
        System.out.println("Summa numbers is " + getSum(numbers));
        System.out.println(" List odd numbers : " + getOddNumber(numbers));
        System.out.println(convertToStringList(numbers));
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.addAll(Arrays.asList("four", "five"));
        System.out.println(" List doubling values: " + doubling(list));
    }
}

