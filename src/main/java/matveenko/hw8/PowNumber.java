package matveenko.hw8;


public class PowNumber {

    public static void main(String[] args) {
        Pow ref = (number, pow) -> {
            int result = 1;
            for (int i = 1; i <= pow; i++) {
                result *= number;
            }
            return result;
        };
        System.out.println("Exponentiation = " + ref.pow(2, 3));
    }
}

@FunctionalInterface
interface Pow {
    int pow(int number, int pow);
}