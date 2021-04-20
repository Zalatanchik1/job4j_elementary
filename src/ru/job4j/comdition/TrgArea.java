package ru.job4j.comdition;

public class TrgArea {
    public static double area(double a, double b, double c, double p) {
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double halfMeter(double a, double b, double c) {
        return a + b + c;

    }

    public static void main(String[] args) {
        double rsl = TrgArea.halfMeter(2, 2, 2);
        double rsl1 = TrgArea.area(2, 2, 2, rsl);
        System.out.println("Полупермитр треугольника равен: p = " + rsl);
        System.out.println("Площадь треугольника равна: S = " + rsl1);
    }
}
