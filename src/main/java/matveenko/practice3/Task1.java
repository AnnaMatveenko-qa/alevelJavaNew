package matveenko.practice3;

/*Задача
Требуется написать программу, вычисляющую значение какой-либо функции y=(x).
Допустим такой:
 y = x - 2  если  x > 0,
 y = 0   если  x = 0,
 y = |x|  если  x < 0*/
public class Task1 {
    public static void main(String[] args) {
        int x1 = -2;
        int x2 = 0;
        double x3 = 55.5;
        System.out.println(("f (" + x1 + ")=" + calc(x1)));
        System.out.println(("f (" + x2 + ")=" + calc(x2)));
        System.out.println(("f (" + x3 + ")=" + calc(x3)));
    }

    public static double calc(double x) {
        if (x > 0) {
           return x - 2;
        }
            return Math.abs(x);
        }
    }
