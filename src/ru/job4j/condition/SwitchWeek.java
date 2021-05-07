package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String dayString;
        switch (day) {
            case 1 :
                dayString = "Monday";
                break;
            case 2 :
                dayString = "Tuesday";
                break;
            case 3 :
                dayString = "Wednesday";
                break;
            case 4 :
                dayString = "Thursday";
                break;
            case 5 :
                dayString = "Friday";
                break;
            case 6 :
                dayString = "Saturday";
                break;
            case 7 :
                dayString = "Sunday";
                break;
            default:
                dayString = "Error";
                break;
        }
        return dayString;
    }

    public static void main(String[] args) {
        String dayString = SwitchWeek.nameOfDay(0);
        System.out.println(dayString);
    }
}
