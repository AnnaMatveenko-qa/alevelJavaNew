package practice;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите 3 любых целых числа: ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        int number1Abs = Math.abs(number1);
        int number2Abs = Math.abs(number2);
        int number3Abs = Math.abs(number3);
       if ((number1Abs < number2Abs) || (number2Abs < number3Abs)) {
           if (number3Abs > number1Abs)
               System.out.println(number1);
           else System.out.println(number3);
       }
       if ((number1Abs > number2Abs) || (number1Abs > number3Abs)) {
           if (number2Abs > number3Abs)
               System.out.println(number3);
           else System.out.println(number2);
       }
     /* if (number2Abs < number1Abs) {
           if (number3Abs < number2Abs)
               System.out.println(number3);
           else System.out.println(number2);
       }*/

    }
}