package matveenko.practice3;

//Задача
//Как возвести число в степень.
//
//Чтобы возвести число в степень, его надо умножить само на себя количество раз, равное показателю степени.
// Т.е. возведение числа n в степень d будет выглядеть так:
//
//nd = n1 * n2 * n3 * … * nd, где индексы внизу просто указывают очередное по счету n.
public class Task5 {
    public static void main(String[] args) {
        int number = 3;
        int power = 3;
        System.out.println(power(number, power));
    }

    public static int power(int number, int number1) {
        int result = 1;
        for (int i = 1; i <= number1; i++) {
            result *= number;
        }
        return result;
    }
}



