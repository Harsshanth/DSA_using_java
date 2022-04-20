package com.company.zoho;


import java.util.*;

public class BalanceBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        LinkedList<Character> queue = new LinkedList<Character>();
        String input = sc.next();
        String output = "";
        for(int i=0;i<input.length();i++) {
            char temp = input.charAt(i);
            if(temp == '(' || temp == '{' || temp == '[') {
                stack.push(temp);
            }else if(temp == '}' || temp == ']' || temp == ')') {
                output = output + stack.peek();
                stack.pop();

                while(!queue.isEmpty()) {
                    output = output + queue.peek();
                    queue.pop();
                }
                output = output + temp;
            }else{
                queue.add(temp);
            }
        }
        System.out.println(output);
    }
}
