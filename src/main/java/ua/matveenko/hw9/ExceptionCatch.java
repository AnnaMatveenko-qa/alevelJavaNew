package ua.matveenko.hw9;

public class ExceptionCatch {
    private static void g() throws Exception {
        throw new Exception("I am waiting for you");
    }

    private static void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("I am here");
        }
    }

    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}