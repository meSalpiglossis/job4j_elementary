package ru.job4j;

import ru.job4j.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        var emoji = "-(";
        String emoji2 = ":" + emoji.replace("(", ")");
        System.out.println(emoji2);
    }
}
