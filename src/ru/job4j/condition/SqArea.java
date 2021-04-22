package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        return Math.pow(p / (2 * (k + 1)), 2) * k;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(22, 5);
        System.out.println(" p = 6, k = 2, S = " + result1);
    }
}
