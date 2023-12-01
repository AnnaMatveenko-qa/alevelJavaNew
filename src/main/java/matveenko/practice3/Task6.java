package matveenko.practice3;

/*Задача
Написать программуб, подсчитывающую количество четных и нечетных цифр в числе.
2 6 3 */
public class Task6 {
    public static void main(String[] args) {
        int number = 5_473_484;
        printEvenAndOddAmount(number);
    }

    public static void printEvenAndOddAmount(int number) {
        System.out.println("number: " + number);
        int even = 0;
        int odd = 0;
        while (number != 0) {
            int remainder = number % 10;
            if (remainder % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            number /= 10;
         }
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
    }

}

