package matveenko.practice3;
/* Задача
Для введенного с клавиатуры натурального числа расчитатайте сумму всех его цифр
(заранее не известно сколько цифр в числе)
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        int sum = calcSum(number);
        System.out.println(sum);
    }
    public static int calcSum(int bigNumber) {
        int sum = 0;
        while (bigNumber != 0) {
            int remainder = bigNumber % 10;
            sum += remainder;
            bigNumber /= 10;
        }
        return (sum);
    }
}
