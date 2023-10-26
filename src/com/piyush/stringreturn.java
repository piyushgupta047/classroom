package com.piyush;

import java.util.Scanner;

public class stringreturn {
    public static void main(String[] args) {
       Scanner in =  new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = in.next();
        String personalised = myGreet(name);
        System.out.println(personalised);
    }
    static String myGreet(String name){
        String greeting =  "How are you!!!" + name;
        return greeting;
    }
}
