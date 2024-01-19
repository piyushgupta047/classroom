package com.piyush;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length);// it will print no. of rows

        // input the elements of an array

        for (int row = 0; row < arr.length; row++) {
            // the col loop will run for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }
        }

        // output

        for (int row = 0; row < arr.length; row++) {
            // the col loop will run for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println();
            System.out.println(Arrays.toString(arr[row]));
        }

// or we can use the array string method to print the matrix array




    }
}
