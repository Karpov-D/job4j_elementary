package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Алексей";
        names[1] = "Александр";
        names[2] = "Анатолий";
        names[3] = "Августин";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
