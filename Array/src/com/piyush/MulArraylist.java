package com.piyush;
import java.util.Scanner;
import java.util.ArrayList;
public class MulArraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the list Elements which are needed to be present inside the arraylist : ");
        ArrayList<ArrayList<Integer>> list =  new ArrayList<>();

        // Initializing the Arraylist
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>()); // It will add a new arraylist to the list

        }    // to add elements


        // The outer loop will iterate through the arraylist making the list with the three elements from 0 index to 2
            for (int i = 0; i < 3; i++){

                // The inner loop will iterate through the arraylist elements to make them the size of four from 0 to 3
                for (int j = 0; j < 4; j++) {
                    list.get(i).add(in.nextInt());// it will print the input elements by their respective indeces
                }


        }
            System.out.println(list);
    }
}
