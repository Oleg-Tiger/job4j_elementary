package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double difAndDiv(double first, double second) {
        return dif(first, second)
                + div(first, second);
    }

    public static double allOperations(double first, double second) {
        return difAndDiv(first, second)
                + sumAndMultiply(first, second);
    }

    public static void main(String[] args) {
        System.out.printf("Результат расчета равен: %s%n", sumAndMultiply(10, 20));
        System.out.printf("Результат расчета равен: %s%n", difAndDiv(20, 10));
        System.out.printf("Сумма всех операций с числами равна: %s%n", allOperations(20, 10));
    }

}