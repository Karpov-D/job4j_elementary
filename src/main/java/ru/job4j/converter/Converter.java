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

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 Euro. Test result : " + passed);

        float in2 = 150;
        float expected2 = 2.5f;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected == out;
        System.out.println("140 rubles are 2.5 Dollar. Test result : " + passed2);

        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(150);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("150 rubles are " + dollar + " dollar.");
    }
}
