package ua.matveenko.hw10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Lists {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("The day before yesterday");
        list.add("Yesterday");
        list.add("Today");
        list.addAll(Arrays.asList("Tomorrow", "The day after tomorrow"));
        System.out.println(list);
        System.out.println("===========================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("===========================================");
        for (String element : list) {
            System.out.println(element);
        }
        System.out.println("===========================================");
        int count = 0;
        while (list.size() > count) {
            System.out.println(list.get(count));
            count++;
        }
        System.out.println("===========================================");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===========================================");
    }

}