package com.company.zoho;

import java.util.*;

public class StringCrossArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch[] = str.toCharArray();
        ArrayList<Character> chR  = new ArrayList<Character>();
        for(char c : ch) {
            chR.add(c);
        }
        Collections.reverse(chR);
        for(int i = 0; i < ch.length; i++) {
            for(int j = ch.length - 1; j >= 0; j--) {

            }
        }
    }
}
