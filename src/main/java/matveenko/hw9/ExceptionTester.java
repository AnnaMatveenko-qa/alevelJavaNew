package matveenko.hw9;

public class ExceptionTester {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("It happens");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("I am here");
        }
    }
}
