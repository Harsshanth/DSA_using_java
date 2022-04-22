package com.company.zoho;

import java.util.Scanner;

public class FindSubString {

    public static int index(String str, String sub){
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == sub.charAt(0)) {
                for(int j = 1; j<sub.length() && i+j < str.length(); j++) {
                    if(str.charAt(i+j) == sub.charAt(j)){
                        count++;
                        if(count == sub.length()-1){
                            return i;
                        }
                        continue;
                    }else
                        break;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        String str = sc.next();
        String sub = sc.next();
//        Inbuild Function
        System.out.println("Using InBuild: "+ str.indexOf(sub));

        System.out.println("Using MyDefined: " + index(str,sub));

    }
}
