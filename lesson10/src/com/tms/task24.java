package com.tms;

public class task24 {
    public static void main(String[] args) {
        Time t1 = new Time(8,25,30);
        Time t2 = new Time(5,15,45);
        t1.compareTo(t2);

        System.out.println( "t1 seconds amount " + t1.secondsamount());
        System.out.println( "t2 seconds amount " + t2.secondsamount());
    }






}
