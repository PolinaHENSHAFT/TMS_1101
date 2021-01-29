package com.tms;

public class tasknum9 {
        public static void main(String[] args) {

            double averageProd = 0;
            double prod = 1;
            int n = 0;
            int x = (int) (Math.random() * 20);
            System.out.println("random number " +n +" = " + x);
            while (x != 0) {
                prod *= x;
                n++;
                x = (int) (Math.random() * 9);

                System.out.println("product= " + prod);
                System.out.println("random number " +n +" = " + x);
            }
            if (n != 0) {
                averageProd = prod / n;
            } else {
                averageProd = 0;
            }
            System.out.println("product = " + prod);
            System.out.println("number of iterations= " + n);
            System.out.println("the average "+ " = " + averageProd);


        }


    }



