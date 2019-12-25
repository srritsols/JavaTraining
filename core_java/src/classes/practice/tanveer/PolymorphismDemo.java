package com.classes;
//method overloading ... compile time
class OverloadAdd{
    static int add(int a, int b){
        return  a+b;
    }
    static float add(float a, float b){
        return  a+b;
    }
}
//method overriding ... run time
class Person{
    void getName(){
        System.out.println("Person Name");
    }
}
class Employee extends Person{
    void getName(){
        System.out.println("Employee Name");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println(OverloadAdd.add(1,2));
        System.out.println(OverloadAdd.add(1.0f,3.0f));

        Person p1 = new Person();
        p1.getName();

        Employee e = new Employee();
        e.getName();
        Person p2 = new Employee();
        p2.getName();
    }
}
