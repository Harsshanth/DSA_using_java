package com.company.zoho;
import java.util.*;

//  https://www.geeksforgeeks.org/zoho-interview-set-2-campus/?ref=lbp

public class ArrayArrangement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        System.out.println("Enter the limit: ");
        int limit = sc.nextInt();
        System.out.println("Enter the values: ");
        for(int i=0;i<limit;i++) {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println("Output: ");
        for(int i=0;i<limit;i++){
            if(i%2 == 0){
                System.out.print(list.get(list.size()-1) + " ");
                list.remove(list.size()-1);
            }else{
                System.out.print(list.get(0) + " ");
                list.remove(0);
            }
        }
    }
}
