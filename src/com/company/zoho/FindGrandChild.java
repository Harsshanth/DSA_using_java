package com.company.zoho;

import java.util.Scanner;

public class FindGrandChild {
    public static void main(String[] args) {
        String[][] relation = {
                {"luke", "shaw"},
                {"wayne","rooney"},
                {"rooney" , "ronaldo"},
                {"shaw","rooney"}
        };
        String toFind = "ronaldo";
        String sonOfronaldo = null;
        int count  = 0;
        for(int i = 0; i < relation.length; i++) {
            if(relation[i][1] == toFind){
                sonOfronaldo = relation[i][0];
                if(sonOfronaldo != null) {
                    for(int j = 0; j < relation.length; j++) {
                        if(relation[j][1] == sonOfronaldo){
                            count++;
                        }
                    }
                    sonOfronaldo = null;
                }
            }
        }
        System.out.println(count);
    }
}
