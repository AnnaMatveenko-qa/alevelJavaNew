package matveenko.hw2;

import java.util.Scanner;

public class Les2Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 3 любых целых числа: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        if (Math.abs(number1) < Math.abs(number2) && Math.abs(number1) < Math.abs(number3)) {
            System.out.println(number1);
        } else if (Math.abs(number1) < Math.abs(number2) && Math.abs(number1) > Math.abs(number3)) {
            System.out.println(number3);
        } else if (Math.abs(number1) > Math.abs(number2) && Math.abs(number1) > Math.abs(number3) && Math.abs(number2) > Math.abs(number3)) {
            System.out.println(number3);
        } else if (Math.abs(number1) > Math.abs(number2) && Math.abs(number1) > Math.abs(number3) && Math.abs(number2) < Math.abs(number3)) {
            System.out.println(number2);
        } else if (Math.abs(number1) == Math.abs(number2) && Math.abs(number1) == Math.abs(number3)) {
            System.out.print(number1);
            System.out.print(" ");
            System.out.print(number2);
            System.out.print(" ");
            System.out.print(number3);
        } else if (Math.abs(number1) == Math.abs(number2) &&
        Math.abs(number1) < Math.abs(number3)) {
            System.out.print(number1);
            System.out.print(" ");
            System.out.print(number2);
        } else if (Math.abs(number1) > Math.abs(number2) && Math.abs(number2) == Math.abs(number3)) {
            System.out.print(number2);
            System.out.print(" ");
            System.out.print(number3);
        } else if (Math.abs(number1) < Math.abs(number2) && Math.abs(number1) == Math.abs(number3)) {
            System.out.print(number1);
            System.out.print(" ");
            System.out.print(number3);
        }
    }
}


