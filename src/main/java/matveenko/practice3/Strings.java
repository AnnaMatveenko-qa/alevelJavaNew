package matveenko.practice3;

public class Strings {
    public static void main(String[] args) {
        String text = "public static void      main(String[] args) {";
        System.out.println(text);
        String stringWithoutSpaces = text.replace(" ", "");
        System.out.println(stringWithoutSpaces);
    }
}
