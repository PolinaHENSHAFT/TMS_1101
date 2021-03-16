package com.tms;

import java.util.ArrayList;
import java.util.Iterator;

public class task29 {
    public static void main(String[] args) {

        ArrayList<Integer> grade = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int g = 10 + (int) (Math.random() * 90);
            grade.add(g);
        }
        System.out.println(grade);

        Iterator<Integer> iterator = grade.iterator();
        Integer min = 45;
        while (iterator.hasNext()) {

            if (iterator.next() <= min) {
                iterator.remove();
            }
        }
        System.out.println(grade);
    }
}