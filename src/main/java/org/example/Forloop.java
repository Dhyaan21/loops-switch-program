package org.example;

public class Forloop {
    public static void main(String[] args) {
        //This is even number program
        for (int a = 1; a <= 18; a++) {
            if (a % 2 == 0) {
                System.out.println(a + " is even no.");
            }
        }

        // for (int a = 2; a <= 10; a=a+2) {
        //    System.out.println(a + " is even no. + 2");

        //This is odd number program
        for (int a = 1; a <= 18; a++) {
            if (a % 2 == 1) {
                System.out.println(a + " is odd no.");
            }
        }
        // Table of 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * 10 = " + (i * 10));
        }

    }


}
