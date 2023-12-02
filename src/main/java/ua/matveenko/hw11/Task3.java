package ua.matveenko.hw11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class Task3 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> line = new LinkedList<>();
        addElementsList(strings);
        System.out.println(strings.size());
        addElementsList(line);
        System.out.println(line.size());
        getRandomElements(strings);
        getRandomElements(line);
    }

    public static void addElementsList(List<String> strings) {
        for (int i = 0; i < 100000; i++) {
            strings.add(Integer.toString(i));
        }
    }

    public static void getRandomElements(List<String> strings) {
        Random rand = new Random();
         long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            int index = rand.nextInt(strings.size());
            strings.get(index);
        }
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("Time : " + timeElapsed);
    }
}
