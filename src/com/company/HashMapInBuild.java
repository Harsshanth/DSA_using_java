package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapInBuild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,String> hash = new HashMap<>();
        for(int i = 0; i < 3; i++) {
            hash.put(sc.nextInt(),sc.next());
        }
        HashMap<Integer,String> hash1 = new HashMap<>(hash);
        System.out.println(hash.hashCode() + " " + hash1.hashCode() + " "  + hash1);
        //Interation
        for(Map.Entry<Integer,String> e : hash.entrySet()){
            System.out.println("Key : " + e.getKey() + " " + " Value : " + e.getValue() );
        }
    }
}
