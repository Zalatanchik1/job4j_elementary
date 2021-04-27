package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return (ab + ac) > bc && (ac + bc) > ab && (ab + bc) > ac;
    }


    public static void main(String[] args) {
        System.out.println(exist(2, 2, 2));
    }
}

/*
В этом задании нужно проверить, что треугольник может существовать.

Напомню, что треугольник может существовать, если сумма двух сторон больше значения третьей для всех комбинаций.
Допустим у нас заданы три переменные
double ab, ac, bc - это длины сторон.

Нужно проверить, что ab + ac > bc и ac + bc > ab и ab + bc > ac - в этом случае треугольник существует.

В этом задании нужно использовать булеву логику и оператор && (логическое и).
 */
