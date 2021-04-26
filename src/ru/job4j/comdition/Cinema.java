package ru.job4j.comdition;

public class Cinema {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        if (allowByParent && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}

//1. Ниже приведен каркас класса. Метод permission должен вывести на консоль решение о посещении кинотеатра.
//2. Допишите метод permission так, что если обе переменные -"истина", то мы можем пойти в кино.
