package matveenko.hw2;

public class Task2 {
    public static void main(String[] args) {
        int AX = 1;
        int AY = 5;
        int BX = 3;
        int BY = 5;
        int CX = 6;
        int CY = 7;
        double areaTriangle = 0.5 * calc2Area(AX, AY, BX, BY, CX, CY);
        System.out.println(areaTriangle);
    }

    public static double calc2Area(int X1, int Y1, int X2, int Y2, int X3, int Y3) {
        return Math.abs((X2 - X1) * (Y3 - Y1) - (X3 - X1) * (Y2 - Y1));
    }

}

