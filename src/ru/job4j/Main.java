package ru.job4j;

import ru.job4j.condition.MultipleSwitchWeek;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(new MultipleSwitchWeek().numberOfDay("Понедельник"));
    }
}