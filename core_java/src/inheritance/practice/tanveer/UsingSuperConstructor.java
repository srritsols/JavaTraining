package com.inheritance;
//using super class constructor
class PersonInh{
    int id;
    String name;
    public PersonInh(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "PersonInh{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class EmployeeInh extends PersonInh{
    String address;
    public EmployeeInh(int id, String name, String address) {
        super(id, name);
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + " EmployeeInh{" +
                "address='" + address + '\'' +
                '}';
    }
}
public class UsingSuperConstructor {
    public static void main(String[] args) {
        PersonInh ph = new PersonInh(10, "John");
        EmployeeInh eh = new EmployeeInh(20, "Jack", "TX");
        System.out.println("ph: "+ph.toString());
        System.out.println("eh: "+eh.toString());
    }
}
