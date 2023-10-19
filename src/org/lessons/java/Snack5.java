package org.lessons.java;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        String num = scanner.nextLine();

        int totale = 0;
//        char[] array = new char[num.length()];
        for (int i = 0; i < num.length(); i++) {
            int numero = 0;
            switch (num.charAt(i)){
                case '0':
                    numero = 0;
                    break;
                case '1':
                    numero = 1;
                    break;
                case '2':
                    numero = 2;
                    break;
                case '3':
                    numero = 3;
                    break;
                case '4':
                    numero = 4;
                    break;
                case '5':
                    numero = 5;
                    break;
                case '6':
                    numero = 6;
                    break;
                case '7':
                    numero = 7;
                    break;
                case '8':
                    numero = 8;
                    break;
                case '9':
                    numero = 9;
                    break;
            }
            totale = numero + (totale * 10);
        }

        System.out.println(totale);
        scanner.close();
    }
}
