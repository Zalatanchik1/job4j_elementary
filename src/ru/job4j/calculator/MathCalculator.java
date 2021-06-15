package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divideAndDifference(double first, double second) {
        return divide(first, second)
                + difference(first, second);
    }

    public static double arithmeticOperation(double first, double second) {
        return sum(first, second)
                + difference(first, second)
                + divide(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат равен: " + divideAndDifference(20, 5));
        System.out.println("Результат равен: " + arithmeticOperation(15, 3));
    }
}
