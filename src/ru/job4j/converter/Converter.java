package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return  value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        int in1 = 360;
        int expected1 = 6;
        int out1 = Converter.rubleToDollar(in);
        boolean passed1 = expected == out;
        System.out.println("360 rubles are 6. Test result : " + passed1);
    }
}
