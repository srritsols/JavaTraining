package com.controlStatements;

public class ControlStatementSwitch {
    public static void main(String[] args) {
        int marks = 90;
        String output;
        System.out.println("- Switch Statement -");

        switch (marks){
            case 90:
                output = "Grade A";
                break;
            case 80:
                output = "grade B";
                break;
            case 60:
                output = "grade C";
                break;
            default:
                output = "grade D";
        }
        System.out.println(output);
    }
}
