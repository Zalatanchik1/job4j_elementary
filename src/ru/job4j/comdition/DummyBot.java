package ru.job4j.comdition;

import java.sql.SQLOutput;

public class DummyBot {

    public static String answer(String question) {
        System.out.println(question);
        String rsl;
        if (question.equals("Привет, Бот")) {
            rsl = "Привет, умник";
        }
        else if (question.equals("Пока.")) {
            rsl = "До скорой встречи!";
        } else {
            rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Привет, Бот");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
    }
}