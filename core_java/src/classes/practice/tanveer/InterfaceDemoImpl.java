package com.classes;

public class InterfaceDemoImpl implements InterfaceDemo{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public void display() {
        System.out.println("a and b: " + add(2,2));
    }
}
