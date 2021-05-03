package ru.job4j.array;

public class Merge {

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < left.length + right.length; i++) {
            if (a == left.length) {
                rsl[i] = right[b];
                b++;
            } else if (b == right.length) {
                rsl[i] = left[a];
                a++;
            } else if (left[a] > right[b]) {
                rsl[i] = right[b];
                b++;
            } else {
                rsl[i] = left[a];
                a++;
            }
        }
        return rsl;
    }
}
