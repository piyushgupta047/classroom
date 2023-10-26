package com.piyush;
import java.util.Scanner;
public class examples {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse : ");
        String str = input.next();
        String revstr = "";
        int p =  str.length()-1;

        for (int i = p;  i>=0 ;i--){
            revstr =  revstr + str.charAt(i) ;



        }
        System.out.println(revstr);
    }
}
