package org.example;

public class WhileLoop {
    public static void main(String args[]) {
        //This is even number
        int i = 0;
        while (i <= 18) {
            if (i % 2 == 0) {
                System.out.println(i + " even number");
            }
            i++;
        }
        //This is odd number
        int j = 0;
        while (j <= 18) {
            if (j % 2 == 1) {
                System.out.println(j + "odd number");
            }
            j++;

        }
        //Table of 9
        int m = 1;
        int h = 9;
        while (m <= 10) {
            System.out.println(h + " * " + m + " = " + h * m);
            m++;


        }

    }
}








