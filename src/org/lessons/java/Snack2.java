package org.lessons.java;

import java.util.Arrays;
import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        String[] nomi = {
                "Katie", "Liam",
                "Mia", "Noah", "Olivia", "Parker", "Quinn", "Riley",
                "Sophia", "Thomas"
        };
        String[] cognomi = {
                "Renna", "Luighi",
                "Tuonardo", "Lorenauto", "Giancella", "Ludoretano", "Estass", "Monkey",
                "Bartolomew", "Hogward"
        };

        Random randomNum = new Random();

        for (String nome : nomi
             ) {
            System.out.printf("%s %s%n",nome,cognomi[randomNum.nextInt(10)]);
        }

    }
}
