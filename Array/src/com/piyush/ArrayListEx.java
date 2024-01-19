package com.piyush;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main(String[] args) {
         // Syntax of an ArrayList

        ArrayList<Integer> list = new ArrayList<>(10);

        // To add elements in this list we can use list.add

        list.add(13);
        list.add(23);
        list.add(33);
        list.add(43);
        list.add(53);
        list.add(63);

        // to check if the list contains this element or not
        System.out.println(list.contains(33));// It will give either true or false

        System.out.println(list);
         // to modify the particular element with the help of index

        list.set(1,73);  // it will change the element of the 1st index to 73

        list.remove(4);

        // list.get();
        System.out.println(list);



    }
}
