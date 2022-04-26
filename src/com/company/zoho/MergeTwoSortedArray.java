package com.company.zoho;

import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a[] = {1,3,5,6,7,8};
        int b[] = {2,4,9,10};
        int c[] = new int[a.length + b.length];
        int m = 0 ,i = 0,j = 0;
        for(i = 0, j = 0; i < a.length && j < b.length ;) {
            if(a[i] > b[j]){
                c[m] = b[j];
                m++;
                j++;
            } else if(a[i] < b[j]) {
                c[m] = a[i];
                m++;
                i++;
            }else {
                c[m] = a[i];
                c[m+1] = b[j];
                m = m+2;
                i++;
                j++;
            }
        }
        while(i < a.length){
            c[m++] = a[i++];
        }
        while(j < b.length) {
            c[m++] = b[j++];
        }
        for(int k : c) {
            System.out.println(k);
        }
    }
}
