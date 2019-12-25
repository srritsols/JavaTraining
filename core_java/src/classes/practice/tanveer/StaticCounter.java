package com.classes;

public class StaticCounter {
    static{
        System.out.println("Static Block Invoked.");
    }
    static  int c=0;

    public static void main(String[] args) {
        StaticCounter st1 = new StaticCounter();
        StaticCounter st2 = new StaticCounter();
        StaticCounter st3 = new StaticCounter();
    }

    public StaticCounter(){
        c++;
        System.out.println(c);
    }
}
