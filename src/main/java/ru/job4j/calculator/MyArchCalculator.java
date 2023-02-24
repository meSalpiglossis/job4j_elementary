package ru.job4j.calculator;

public class MyArchCalculator {
    public static void divider(double lenght, int times) {
        double onePart = lenght / times;

        for (int i = 1; i <= times; i++) {
            System.out.println("Part #" + i + " ends at " + onePart * i);
        }
    }

    public static void main(String[] args) {
        divider(52.4, 3);
    }
}
