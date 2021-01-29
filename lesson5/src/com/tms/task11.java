package com.tms;

import java.util.Random;

public class task11 {
    public static void main(String[] args) {

        Random rand = new Random();

        int a = 31;
        int x = 2;
        int a1 = a % a;
        int a2 = a % 1;
        int a3 = a % x;
            if (a1 == 0 & a2 == 0 & a3 !=0 ) {
                System.out.println("The number a is simple ");
            } else {
                System.out.println("The number a is not simple");

            }
        }

    }

