package matveenko.practice3;

/*Частота встречаемости символа в строке
Задача
Определить, как часто встречается определенный символ в строке
 */
public class Task3 {
    public static void main(String[] args) {
        String text = "public static void main(String[] args) {";
        int charAmount = calcCharFrequency(text,  'a');
        System.out.println(charAmount);
    }

    public static int calcCharFrequency(String input, char symbol) {
        int amount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                amount++;
            }
        }
        return amount;
    }
}