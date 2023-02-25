package ru.job4j;

import ru.job4j.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        var emoji = "-(";
        // BEGIN (write your solution here)
        String emoji2 = ":" + emoji.replace("(", ")");
        System.out.println(emoji2);
        // END

    }
}
