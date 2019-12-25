package com.classes;
//static method can call static method only.
public class StaticMethodCall {
    public static void sMethodCaller(){
        sMethod();
        return;
    }
    public void instMethodCaller(){
        sMethod();
        instMethod();
        return;
    }
    public static void sMethod(){
        return;
    }
    public void instMethod(){
        return;
    }
}
