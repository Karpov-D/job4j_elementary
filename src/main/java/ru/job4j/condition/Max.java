package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first >= second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int rsl = max(first, second);
        return third >= rsl ? third : rsl;
    }

    public static int max(int first, int second, int third, int fourth) {
        int rsl = max(first, second);
        int rsl2 = max(third, fourth);
        return rsl2 >= rsl ? rsl2 : rsl;
    }
}
