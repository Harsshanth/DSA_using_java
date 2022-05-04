package com.company.odessa;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fibonacci range : ");
        int range = sc.nextInt();
        int num1 = 0,num2 = 1,ans;
        System.out.print(num1 + " " + num2);
        for(int i = 0; i < range-2; i++) {
            ans = num1 + num2;
            System.out.print(" " + ans);
            num1 = num2;
            num2 = ans;
        }
    }
}
