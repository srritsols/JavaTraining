package com.controlStatements;

public class ControlStatementIf {
    public static void main(String[] args) {
        int marks = 90;
        System.out.println("- If Statement -");
        if (marks > 90){
            System.out.println("Grade A");
        }else if (marks !=0 && marks < 30){
            System.out.println("Grade F");
        }else if (marks >=30 && marks < 60){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade B");
        }
    }
}
