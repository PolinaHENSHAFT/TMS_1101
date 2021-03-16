package com.tms;

public class Task21 {
    public static void main(String[] args) {
        String text2 = "";
        StringBuilder sb = new StringBuilder();
        StringBuffer sb1 = new StringBuffer();

        long stringtime = System.currentTimeMillis();

        for (int i = 0; i < 10; i++) {
            text2 += "Good morning ";
        }
        System.out.println(text2 + "The time is " + stringtime);


        long sbtime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            sb.append(" Good day ");
        }
        System.out.println(sb + "The time is " + sbtime);

        long sb1time = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            sb1.append(" Good night ");
        }
        System.out.println(sb1 + "The time is " + sb1time);
    }
}