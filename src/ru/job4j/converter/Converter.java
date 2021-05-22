package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToRub(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static float euroToRub(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static void main(String[] args) {

        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        float rub1 = Converter.dollarToRub(2);
        float rub2 = Converter.euroToRub(2);
        System.out.println(140 + " rubles are " + euro + " euro.");
        System.out.println(140 + " rubles are " + dollar + " dollar.");
        System.out.println("2 dollars are " + rub1 + " rubles.");
        System.out.println("2 euro are " + rub2 + " rubles.");
    }
}
