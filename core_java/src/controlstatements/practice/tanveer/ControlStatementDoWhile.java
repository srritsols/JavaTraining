package com.controlStatements;

public class ControlStatementDoWhile {
    public static void main(String[] args) {
        int marks = 90;
        System.out.println("- Do While Statement -");

        do{
            System.out.println("Good Grade.");
            break;
        }
        while(marks!=0);
    }
}
