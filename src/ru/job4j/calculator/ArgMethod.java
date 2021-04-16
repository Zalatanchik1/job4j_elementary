package ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello," + name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        String name = "Alex Golubev";
        int age = 24;
        ArgMethod.hello(name,age);
    }
}
