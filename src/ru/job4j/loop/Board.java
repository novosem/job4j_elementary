package ru.job4j.loop;

public class Board {

    public static void paint(int width, int height) {
        for (int row = 1; row <= width; row++) {
            for (int sell = 1; sell <= height; sell++) {
                if ((sell + row) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
