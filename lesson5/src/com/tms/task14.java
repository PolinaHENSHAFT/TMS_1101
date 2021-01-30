package com.tms;

public class task14 {
    public static void main(String[] args) {
        int grades[] = {43, 90, 78, 95, 61};
        int max;
        int min;
        max = grades[0];
        min = grades[0];
        for (int i = 0; i < grades.length; i++) {

            if (max < grades[i]) {
                max = grades[i];

            }
            if (min > grades[i]) {
                max = grades[i];

            }
        }
        System.out.println(" the max grade is : " + max);
        System.out.println(" the min grade is : " + min);
    }
}