package ru.job4j.comdition;

public class SqArea {
    public static double square(double p, double k) {
        double height = p / (2 * (k + 1));
        double length = height * k;
        double square = length * height;
        return square;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(18, 6);
        System.out.println("Площадь прямоугольника равна " + result1);
    }
}
