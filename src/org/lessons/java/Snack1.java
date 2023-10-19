package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Inserisci un numero");
            int num = scanner.nextInt();
            if(num < 0 ){
                break;
            }
            if (num % 2 == 0){
                System.out.println(num);
            }else {
                System.out.println(num + 1);
            }
        }
    }
}
