package com.company.zoho;

public class utils {

    public int[] sort(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            for(int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    public int[] reverse(int[] arr) {
        int[] arr1 = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1; i >= 0; i--) {
            arr1[j] = arr[i];
            j++;
        }
        return arr1;
    }
}
