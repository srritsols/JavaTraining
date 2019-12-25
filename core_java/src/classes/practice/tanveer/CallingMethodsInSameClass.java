package com.classes;

public class CallingMethodsInSameClass {
    public static void main(String[] args) {
        printOne();
        printTwo();
    }
    private static void printOne() {
        System.out.println("");
    }
    private static void printTwo() {
        printOne();
        printOne();
    }
}
