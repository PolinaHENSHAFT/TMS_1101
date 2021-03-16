package com.tms;

public class task25 {
    public static void main(String[] args) {
        bankomat b1= new bankomat(100,50,50);
        b1.addmoney(15,4,9);
        System.out.println(b1);

        b1.takemoney(10,6,3);
        System.out.println(b1);
    }
}
