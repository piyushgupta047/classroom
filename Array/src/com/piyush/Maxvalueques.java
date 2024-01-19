package com.piyush;

public class Maxvalueques {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,3456,6345,457,6};
        System.out.println(max(arr));
        System.out.println(maxRange(arr,2,3));
    }
    static int max(int[] arr){
        int maxval = arr[0]; // setting max value as first element of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxval){  // compairing every element from that element
                maxval = arr[i];
            }

        }
        return maxval; // printing max element
    }

// Another edge case of the same program if range is given
    static int maxRange(int[] arr , int start , int end){
        int maxval = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > maxval){  // compairing every element from that element
                maxval = arr[i];
            }

        }
        return maxval; // printing max element
    }

}
