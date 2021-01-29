package com.tms;

public class task12 {

    public static void main(String[] args) {
        int n= 0;
        int sum= 0;

        for (int i=0;sum<=100;i++ ) {
           if(sum%3==0) {
               System.out.println("The sum is divides by 3 " +" the sum is " + sum + " the count of the numbers is " + n );

           }else {
               System.out.println( "the sum is not");
           }
            n++;
            sum= sum+n;
        }




    }
}
