package com.tms;

public class task15 {
    public static void main(String[] args) {
        int numbers []= {4,7,9,3,5};
        for (int i= 0;i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("the reverse is : ");
    for(int i=numbers.length-1;i>=0;i--){
        System.out.println(  numbers[i]);
    }
    }
}
