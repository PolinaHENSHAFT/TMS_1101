package com.tms;

public class task13 {

    public static void main(String[] args) {
        int array []= {4,11,9,6,23,5};
        int max;
         max =array [0];
         for  (int i=0;i< array.length;i++) {

             if (max< array[i]) {
                 max=array[i];

             }
         }
        System.out.println( " the max number is : " + max);
    }

}
