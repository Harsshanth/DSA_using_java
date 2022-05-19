package com.company;

import com.company.zoho.utils;

public class bubbleSort {

    static public void bubbleSortFunc(int[] arr){
        int temp;
        boolean swapped;
        for(int i=0 ;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                   temp= arr[j];
                   arr[j]=arr[j-1];
                   arr[j-1]=temp;
                   swapped = true;
                }  
            }
//            for(int k=0;k<arr.length;k++){
//                System.out.print(arr[k]);
//            }
            System.out.println();
            if(!swapped) break;
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        
    }

    public static void main(String[] args) {
        utils u = new utils();
        int[] arr = {5,2,4,1,3};
        arr = u.reverse(arr);
        for(int x : arr) {
            System.out.println(x);
        }
    }
    
}

// 3 4 1 5

// 3 4 1 5; 3 1 4 5; 3 1 4 5;

// ndejnjscnjds