package com.tms;

public class task16 {
    public static void main(String[] args) {
        int nums[] = {11,15,9,2,22,30};
        int sum=0;
        int max;
        int min;
        max = nums[0];
        min = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (max < nums[i]) {
                max = nums[i];

            }
            if (min > nums[i]) {
                min = nums[i];

            }
       if( nums[i]<max & nums[i]>min);
          sum+= nums[i];


        }
        System.out.println(" the max num is : " + max);
        System.out.println(" the min num is : " + min);
        System.out.println(" the sum of nums : " + sum);
    }
}

