package com.company.zoho;

import java.util.Arrays;
import java.util.Scanner;

public class StringInTwoDimension {

    public static boolean perfectSquare (int num) {
        double sqrt = Math.sqrt(num);
        if((sqrt - Math.floor(sqrt)) == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String search = sc.next();
        char[] searcharr = search.toCharArray();
        int len = str.length();
        while(!perfectSquare(len)){
            len++;
        }
        int index = (int) Math.sqrt(len);
        len = str.length();
        int countrl = 0;
        int counttd = 0;
        int ch = 0;
        char[][] arr = new char[index][index];
        for(int i = 0; i < index; i++) {
            for (int j = 0; j < index; j++) {
                if(ch != len) {
                    arr[i][j] = str.charAt(ch);
                    ch++;

                }
            }
        }
        for(int i = 0; i < index; i++) {
            for(int j = 0; j < index; j++) {
                len = searcharr.length;
                countrl = 0;
                counttd = 0;
                for(int k = 0; k < len; k++){

                    if(j+k < index) {
                        if (arr[i][j + k] == searcharr[k])
                            countrl++;
                        if (countrl == len) {
                            System.out.print("Found" + "Start : " + i + " " + j + " End : " + i + " " + (j + k));
                            System.exit(0);
                        }
                    }
                    if(i+k < index) {
                        System.out.println(arr[i + k][j] + " " + searcharr[k]);
                        if (arr[i + k][j] == searcharr[k])
                            counttd++;
//                        System.out.println(counttd);
                        if (counttd == len) {
                            System.out.print("Found" + "Start : " + i + " " + j + " End : " + (i+k) + " " + j );
                            System.exit(0);
                        }
                    }
                }

            }
        }

    }
}
