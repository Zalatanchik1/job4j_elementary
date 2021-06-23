package ru.job4j.array;

public class EqLast {

    public static boolean check(int[] left, int[] right) {
        for (int i = 0; i < left[left.length - 1]; i++) {
            if (left[i] == right[i]) {
                return true;
            }
        }
        return false;
    }
}
