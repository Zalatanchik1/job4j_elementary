package ru.job4j.comdition;

public class SqArea {
    public static double perimeter(int p, double k) {
        return p / (2 * (k + 1));
    }

    public static double length(double h, double k) {
        return h * k;
    }

    public static double square(double l, double h) {
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.perimeter(6, 2);
        double result2 = SqArea.length(result1, 2);
        double result3 = SqArea.square(result2, result1);

        System.out.println("Высота прямоугольника равна " + result1);
        System.out.println("Длина прямоугольника равна  " + result2);
        System.out.println("Площадь прямоугольника равна " + result3);
    }
}