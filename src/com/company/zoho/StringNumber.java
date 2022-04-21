package com.company.zoho;
import java.util.*;
public class StringNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = 'z';
        int count = 0;

        for(int i = 0; i < str.length();  ) {

            if(Character.isAlphabetic(str.charAt(i))) {
                count = 0;
                ch = str.charAt(i);
                i++;
            }else if(Character.isDigit(str.charAt(i))) {
                while(i < str.length() && Character.isDigit(str.charAt(i))) {
                    count = (count * 10) + Character.getNumericValue(str.charAt(i));
                    i++;
                }
            }
            while(count != 0 ) {
                System.out.print(ch);
                count--;
            }
        }
    }
}
