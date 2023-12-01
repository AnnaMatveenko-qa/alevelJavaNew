package ua.matveenko.hw2;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        String result = number % 2 <= 0 ? "Число " +number+" четное" : "Число " + number+" нечетное ";
        System.out.print(result);
     }
}
