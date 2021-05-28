package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float dollarToRub(float value) {
        return value * 60;
    }

    public static float euroToRub(float value) {
        return value * 70;
    }

    public static void main(String[] args) {
        int in = 140;
        int in2 = 120;
        float expected = 2.0F;
        float euro = Converter.rubleToEuro(in);
        float dollar = Converter.rubleToDollar(in2);
        float rub1 = Converter.dollarToRub(2);
        float rub2 = Converter.euroToRub(2);
        boolean passed = expected == euro;
        boolean passed2 = expected == dollar;
        boolean passed3 = 120.0 == rub1;
        boolean passed4 = 140.0 == rub2;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        System.out.println("120 rubles are 2 dollar. Test result : " + passed2);
        System.out.println("2 dollars are 120 rubles. Test result : " + passed3);
        System.out.println("2 euro 140 rubles. Test result : " + passed4);

    }

}
