package com.company.zoho;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeFourCobination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n+1];

        int size = 1, m = 1;
        while(size <= n) {
            for(int i = 0; i < m && (size + i) <= n; i++) {
                if(arr[size + i] == null){
                    System.out.println(Arrays.toString(arr));
                    arr[size + i] = "";
                }
                arr[size + i] = "3" + arr[size - m + i];

            }
            for(int i=0; i < m && (size + m + i) <= n; i++) {
                arr[size + i + m] = "4" + arr[size - m + i];

            }
            m = m * 2;
            size = size + m;
        }

        System.out.println(arr[n]);
    }
}
