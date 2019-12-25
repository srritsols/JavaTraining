package com.classes;

public class OverloadConstructor {

    private int a;

    public OverloadConstructor(){
        a = 0;
    }

    public OverloadConstructor(int aa){
        this.a = aa;
    }

    public OverloadConstructor(OverloadConstructor oc){
        this.a = oc.a;
    }

    public int getA() {
        return a;
    }

    public static void main(String[] args) {
        OverloadConstructor oc1 = new OverloadConstructor();
        OverloadConstructor oc2 = new OverloadConstructor(5);
        OverloadConstructor oc3 = new OverloadConstructor(oc2);
        System.out.println("oc1.getA(): "+ oc1.getA());
        System.out.println("oc2.getA(): "+ oc2.getA());
        System.out.println("oc3.getA(): "+ oc3.getA());
    }
}
