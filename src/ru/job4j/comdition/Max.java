package ru.job4j.comdition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int max = Max.max(1, 2);
        System.out.println(max);
    }
}
/*
public class Film {
    public static String permission(int age) {
        String label = age >= 18 ? "Please, enjoy it." : "You can't watch it.";
        return label;
    }

    public static void main(String[] args) {
        String msg = Film.permission(33);
        System.out.println(msg);
    }
}
 */