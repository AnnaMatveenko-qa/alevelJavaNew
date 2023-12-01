package ua.matveenko.hw7;


import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Vector {
    double x;
    double y;
    double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public Vector calcCrossProduct(Vector vector) {
        return new Vector((y * vector.z - z * vector.y),
                (z * vector.x - x * vector.z),
                (x * vector.y - y * vector.x));
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public double cosine(Vector vector) {
        double scalar = x * vector.x + y * vector.y + z * vector.z;
        return scalar / (length() * vector.length());

    }

    public Vector sum(Vector vector) {
        return new Vector(
                x + vector.x,
                y + vector.y,
                z + vector.z);
    }

    public Vector difference(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public static Vector[] create(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(ThreadLocalRandom.current().nextInt(-15, 11),
                    ThreadLocalRandom.current().nextInt(1, 11), ThreadLocalRandom.current().nextInt(1, 11));
        }
        return vectors;
    }

    public static void main(String[] args) {
        Vector vector = new Vector(5, 7, 12);
        Vector vector1 = new Vector(5, -3, 1);
        Vector vector2 = vector.calcCrossProduct(vector1);
        System.out.println(vector2.toString());
        double cosine = vector.cosine(vector1);
        System.out.println(cosine);
        System.out.println(vector.sum(vector1));
        System.out.println(vector.difference(vector1));
        Vector[] vectors = Vector.create(5);
        System.out.println(Arrays.toString(vectors));

    }
}





