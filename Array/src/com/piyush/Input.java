package com.piyush;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements : ");

        // arrays of primitives

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 53;
        arr[2] = 43;
        arr[3] = 33;
        arr[4] = 13;

        // [23,53,43,33,13]

        System.out.println(arr[4]);

        //Input using for loops

//        for (int i = 0; i< arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//
//        for (int i = 0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
//
//        }


        // FOR EACH LOOP
//
//        for (int num : arr){ // for every elemment in the array , print the element
//            System.out.println(num + " ");// here num represents the elements of an array
//
       // Another way to print the array by using a string method

//            System.out.println(Arrays.toString(arr));

            // It is the best way to print an array//

            // array of objects

         String[] str = new String[4];
         for (int i = 0 ; i< str.length; i++){
             str[i] = in.next();

         }

        System.out.println(Arrays.toString(str));

        }
    }

