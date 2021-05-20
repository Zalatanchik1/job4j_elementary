package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double remains = percent / 100;
        while (amount >= 0) {
            amount = amount + (int) (amount * remains);
            amount = amount - salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(Mortgage.year(1000, 1200, 1));
    }
}