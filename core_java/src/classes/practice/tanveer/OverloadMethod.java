package com.classes;

public class OverloadMethod {
    public static void main(String[] args) {
        OverloadMethod om = new OverloadMethod();
        om.overLoad((byte)10);
        om.overLoad((short) 10);
        om.overLoad( 10);
        om.overLoad( 10L);
        om.overLoad( 10.0f);
        om.overLoad( 10.0);
        om.overLoad( '1');
        om.overLoad( true);
    }
    public void overLoad(byte input){
        System.out.println("byte: "+input);
    }
    public void overLoad(short input){
        System.out.println("short: "+input);
    }
    public void overLoad(int input){
        System.out.println("int: "+input);
    }
    public void overLoad(long input){
        System.out.println("long: "+input);
    }
    public void overLoad(float input){
        System.out.println("float: "+input);
    }
    public void overLoad(double input){
        System.out.println("double: "+input);
    }
    public void overLoad(char input){
        System.out.println("char: "+input);
    }
    public void overLoad(boolean input){
        System.out.println("boolean: "+input);
    }
}
