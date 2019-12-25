package com.datatypes;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Computer Science";
        int x = 100;
        String s2 = s1 + " " + x;
        String s3 = s2.substring(10,15);

        System.out.println("s1: "+ s1);
        System.out.println("s2: "+ s2);
        System.out.println("s3: "+ s3);

        int y =5, z=6;
        String s6 = x + y + "sum";
        String s7 = "sum" + x + y;
        System.out.println("s6: "+ s6);
        System.out.println("s7: "+ s7);
    }
}
