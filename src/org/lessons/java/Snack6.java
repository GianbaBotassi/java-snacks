package org.lessons.java;

import java.util.Scanner;

public class Snack6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un tot di secondi");
        int secondi = scanner.nextInt();

        int ore = secondi / 3600;
        int minuti = (secondi % 360) / 60;
        secondi = secondi % 60;

        System.out.printf("%02d:%02d:%02d",ore, minuti, secondi);
    }
}
