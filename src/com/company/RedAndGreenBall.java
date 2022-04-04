package com.company;

import java.io.*;
import java.util.*;
class RedAndGreenBall {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        for (int x = 0; x < n; x++) {
            String s = sc.next();
            int p = -1;
            for (int y = 0; y < n; y++) {
                if (s.charAt(y) == 'R') {
                    p = y;
                }
            }
            ar[x] = p;
        }
        int ans = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n - 1; y++) {
                if (ar[y] > ar[y + 1]) {
                    ans++;
                    int t = ar[y];
                    ar[y] = ar[y + 1];
                    ar[y + 1] = t;
                }
            }
        }
        boolean found = true;
        for (int x = 0; x < n; x++) {
            if (ar[x] > x) {
                found = false;
                break;
            }
        }
        System.out.println(found ? ans : -1);
    }
}

