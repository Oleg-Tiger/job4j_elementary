package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index = 0; int i = 0; int j = 0;
        while (j < right.length || i < left.length) {
            if (j == right.length) {
                rsl[index++] = left[i++];
            } else if (i == left.length) {
                rsl[index++] = right[j++];
            } else {
                rsl[index++] = left[i] <= right[j] ? left[i++] : right[j++];
            }
        }
        return rsl;
    }
}