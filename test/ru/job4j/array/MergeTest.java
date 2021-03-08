package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MergeTest {

    @Test
    public void when123And45Then12345() {
        int[] left = {1, 2, 3};
        int[] right = {4, 5};
        int[] result = Merge.merge(left, right);
        int[] expect = {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void when15And26Then1256() {
        int[] left = {1, 5};
        int[] right = {2, 6};
        int[] result = Merge.merge(left, right);
        int[] expect = {1, 2, 5, 6};
        assertThat(result, is(expect));
    }
}