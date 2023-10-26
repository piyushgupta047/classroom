package com.piyush;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int ans = MUL3(20,30);
        System.out.println(ans);
    }
    static int MUL3(int a, int b){
        int sum = a+b;
        return sum;
    }









    static void MUL(){
        Scanner in = new Scanner(System.in);
        int num1 , num2, MUL;
        System.out.println("Enter the first number : ");
        num1 = in.nextInt();
        System.out.print("Enter the second number : ");
        num2 = in.nextInt();
        MUL = num1*num2;
        System.out.println("The Multiply is = " + MUL);// we can use return sum;
    }
}