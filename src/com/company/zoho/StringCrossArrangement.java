package com.company.zoho;

import java.util.*;

public class StringCrossArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = str.toCharArray();
        int m = ch.length-1;
        for(int i = 0; i < ch.length; i++) {
           for(int j = 0; j < ch.length; j++) {
               if(i == j && i + j != ch.length-1){
                   System.out.print(ch[i]);
               }else if(i + j == ch.length-1) {
                   System.out.print(ch[m]);
                   m--;
               }else {
                   System.out.print(" ");
               }
           }
            System.out.println();
       }
    }
}
