package com.tms;

public class task17 {
    public static void main(String[] args) {
        int[][] butterfly = new int[5][5];

        for (int i = 0; i < butterfly.length ; i++) {
            for (int j = i; j < butterfly.length - i; j++) {
                butterfly[i][j] = 1;
                butterfly[butterfly.length - i - 1][j] = 1;
            }
        }
        for (int[] b : butterfly) {
            for (int value : b) {
                System.out.print(" " + value + " ");
            }
            System.out.println();
        }
    }
}