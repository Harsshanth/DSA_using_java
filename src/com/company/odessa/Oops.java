package com.company.odessa;

class Hello{
    static void display(){
        System.out.println("hello");
    }
}
public class Oops extends Hello{
    public static void main(String[] args) {
        Oops ob = new Oops();
        ob.display();
        Oops.display();
        Hello.display();
    }

}
