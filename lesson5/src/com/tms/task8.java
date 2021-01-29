package com.tms;
import java.util.Random;

public class task8 {

    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt();

        if(0 < n){
            System.out.println(n + " RUB");
        }
        else {
            System.out.println("n is not money");
        }
    }

}



