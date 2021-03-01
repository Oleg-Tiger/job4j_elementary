package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int rsl = Factorial.calc(5);
        assertThat(rsl, is(120));
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int rsl = Factorial.calc(0);
        assertThat(rsl, is(1));
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int rsl = Factorial.calc(1);
        assertThat(rsl, is(1));
        /* напишите здесь тест, проверяющий, что факториал для числа 1 равен 1. */
    }
}