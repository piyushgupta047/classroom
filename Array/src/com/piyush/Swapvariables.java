package com.piyush;

import java.util.Arrays;

public class Swapvariables {
    public static void main(String[] args) {
        int [] arr = { 12,345,456,56,57,356};
//        swap(arr , 1, 2 );
//        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr , int index1 , int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            // swap
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
