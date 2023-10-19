package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una parola e verificherò se è palindroma");
        String word = scanner.nextLine();

        String reverseWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord += word.charAt(i);
        }

        System.out.println(word.equals(reverseWord) ? "La parola è palindroma" : "La parola NON è palindroma");

    }
}
