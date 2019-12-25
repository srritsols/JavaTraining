package com.datatypes;

import java.util.Scanner;

public class TestDataMultiplyInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int n1 = in.nextInt();

        System.out.println("Input second number: ");
        int n2 = in.nextInt();

        System.out.println(n1 + "x" + n2 + "="+ (n1*n2));
        System.out.println(n1 + "+" + n2 + "="+ (n1+n2));
        System.out.println(n1 + "-" + n2 + "="+ (n1-n2));
        System.out.println(n1 + "/" + n2 + "="+ (n1/n2));
        System.out.println(n1 + "%" + n2 + "="+ (n1%n2));
    }
}
