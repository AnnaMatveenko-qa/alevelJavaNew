package ua.matveenko.hw12;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Task1 {
    static final String NEXT = "next";
    static final String END = "end";

    public static void main(String[] args) {
        File file = new File("Task1Hw12.CSV");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String words = scan.nextLine();
            if (!Objects.equals(words, END)) {
                writeText(file, words);
            } else {
                scan.close();
                return;
            }
        }
    }

    public static void writeText(File file, String text) {
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            if (Objects.equals(text, NEXT)) {
                fileWriter.write(System.lineSeparator());
            } else {
                fileWriter.write(text + ",");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not find");
        } catch (IOException e) {
            System.out.println("error while reading to file ");
        }
    }
}

