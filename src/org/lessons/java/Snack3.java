package org.lessons.java;

public class Snack3 {
    public static void main(String[] args) {
        int[] numeri = {12, 23, 22, 11, 2, 5, 77, 88, 2, 10};

        int total = 0;

        for (int i = 0; i < numeri.length; i++) {
            if(i % 2 != 0){
                total += numeri[i];
            }
        }
        System.out.println(total);
    }
}
