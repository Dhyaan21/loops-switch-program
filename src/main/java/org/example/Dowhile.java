package org.example;

public class Dowhile {
    public static void main(String args[]) {
        //This is even number
        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " even number");
            }
            i++;
        } while (i <= 18);



        //This is odd number
            int j = 1;
            do {

                if (j % 2 == 1) {
                    System.out.println("odd number " + j);
                }
                j++;

            }
            while (j <= 18);


       //Table of 2
        int k = 1;
        int b = 2;
        do {
            System.out.println(b + " * " + k + " = " + (b * k));
            k++;
        } while (k <= 10);
    }
}