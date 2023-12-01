package matveenko.lecture6;

 public class Point {
    int x;
    int y;
    int z;

    void moveRight(int step) {
        this.x += step;
    }

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.x);
        System.out.println(point.y);
        System.out.println(point.z);
        point.x = 1;
        point.y = 2;
        point.z = -3;
        System.out.println(point.x);
        System.out.println(point.y);
        System.out.println(point.z);
        point.moveRight(5);
        Point origin = new Point();
        origin.moveRight(23);//сначала х=0 так как мы его не задавали//
        System.out.println(point.x);
        System.out.println(origin.x);

    }

}
