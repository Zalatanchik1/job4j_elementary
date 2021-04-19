package ru.job4j.comdition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        short x1 = 6;
        short x2 = 9;
        short y1 = 4;
        short y2 = 8;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println(result);
    }
}
