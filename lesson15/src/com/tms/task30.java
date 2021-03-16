package com.tms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class task30 {
    public static void main(String[] args) {
        ArrayList<Integer> number=  new ArrayList<>();
        for (int i=0;i<50;i++){
            int n= 1+(int) (Math.random()*50);
            number.add(n);
        }
        System.out.println(number);
        Set<Integer> set = new HashSet<>(number);
        number.clear();
        number.addAll(set);
        System.out.println(number);
        for (Integer next : set) {
            System.out.println(next);
        }





    }
}
