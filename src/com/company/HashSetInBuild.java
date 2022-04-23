package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetInBuild {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < 3; i++) {
            set.add(sc.nextInt());
        }
        System.out.println(set);
        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
