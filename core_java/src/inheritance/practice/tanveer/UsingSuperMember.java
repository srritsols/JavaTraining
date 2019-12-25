package com.inheritance;

// we can also use this technique to access methods in super class
class UsingSuperMemberA{
    int num;
}
class UsingSuperMemberB extends UsingSuperMemberA{
    int num;// this will hide the num in A
    UsingSuperMemberB(int a, int b){
        super.num = a;
        num = b;
    }
    void show(){
        System.out.println("super.num: "+super.num);
        System.out.println("num: "+num);
    }
}

public class UsingSuperMember {
    public static void main(String[] args) {
        UsingSuperMemberB b = new UsingSuperMemberB(1,2);
        b.show();
    }
}
