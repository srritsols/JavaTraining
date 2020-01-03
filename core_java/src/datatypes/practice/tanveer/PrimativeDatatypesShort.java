package com.datatypes;

public class PrimativeDatatypesShort {
    public static void main(String[] args) {
        short minShortVal = Short.MIN_VALUE;
        short maxShortVal = Short.MAX_VALUE;

        System.out.println("minShortVal: "+minShortVal);
        System.out.println("maxShortVal: "+maxShortVal);

        short bigShortVal = 32767;
        System.out.println("bigShortVal: "+bigShortVal);

        short minShortValByTwo = (short) (minShortVal/2);
        System.out.println("minShortValByTwo: "+minShortValByTwo);
    }
}
