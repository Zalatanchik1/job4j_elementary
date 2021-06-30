package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Размер вложенного массива равен: " + numbers[i].length
            );
        }
    }
}
//1. Создайте двумерный массив и сразу его заполните по аналогии с описанием.
// Только с некоторыми оговорками - внутри должно быть 4 массива, при этом в первом - 1 элемент, во втором - 2, третьем - 3, четвертом - 4.
