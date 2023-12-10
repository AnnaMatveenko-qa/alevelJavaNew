package ua.matveenko.hw11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("table");
        strings.add("here");
        strings.add("there");
        System.out.println(countNumberOfLetters(strings));
    }

    public static Map<String, Integer> countNumberOfLetters(List<String> strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String value : strings) {
            map.put(value, value.length());
        }
        return map;
    }
}
