package matveenko.lesson9;

import java.util.Arrays;

public class ErrorTester {
    public static void main(String[] args) {
        int x = 60;
        int y = 3;
        int zero = 0;
        DivisionResult result = divisionWithSpecialObject(x, zero);
        if (result.isSuccess()) {
            System.out.println(result.getResult());
        } else {
            System.out.println("Division by zero, error!");
        }
        result = divisionWithSpecialObject(x, y);
        if (result.isSuccess()) {
            System.out.println(result.getResult());
        } else {
            System.out.println("Division by zero, error!");
        }

        try {
            System.out.println(divideWithException(x, zero));
        } catch (DivisionByZeroException exception) {
            System.out.println(exception.getMessage());
            System.out.println(Arrays.toString(exception.getStackTrace()));
        } finally {
            System.out.println("First finally");
        }
        try {
            System.out.println(divideWithException(x, y));
        } catch (DivisionByZeroException exception) {
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("Second finally");
        }
    }

    private static int divideWithException(int fist, int second) throws DivisionByZeroException{
        if (second == 0) {
            throw new DivisionByZeroException("Division by zero prohibited");
        }
        return fist / second;
    }

       private static int divideWithStatusCode ( int first, int second){
            if (second == 0) {
                return -137;
            }
            return first / second;
        }
        private static int divideWithExit ( int fist, int second){
            if (second == 0) {
                System.exit(-1);
            }
            return fist / second;
        }
        private static int divideWithoutErrorHandling ( int fist, int second){
            return fist / second;
        }

    private static DivisionResult divisionWithSpecialObject(int first, int second) {
        if (second == 0) {
            return new DivisionResult(false);
        }
        return new DivisionResult(first / second, true);
    }
}
