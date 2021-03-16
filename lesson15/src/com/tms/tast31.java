package com.tms;

import java.util.ArrayList;
import java.util.Iterator;

public class tast31 {
    public static void main(String[] args) {

        ArrayList<Integer> grade = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int g = 10 + (int) (Math.random() * 10);
            grade.add(g);

            System.out.println(grade);
            Iterator<Integer> iterator = grade.iterator();
            Integer max = 1;
            while (iterator.hasNext()) {
                if (iterator.next()>=max && iterator.hasNext()){
                    max = iterator.next();
                }
            }
            System.out.println("the max grade is " + max);
        }
    }
}