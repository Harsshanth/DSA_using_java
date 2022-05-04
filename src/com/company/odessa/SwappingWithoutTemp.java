package com.company.odessa;

public class SwappingWithoutTemp {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap : \n a: "+ a + " b: "  + b);
    }
}



