package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] qq = new int[5];
        for (int index = 0; index < qq.length; index++) {
            qq[index] = index * 2 + 3;
        }
        for (int i = 0; i < qq.length; i++) {
            System.out.println(qq[i]);
        }
    }
}
