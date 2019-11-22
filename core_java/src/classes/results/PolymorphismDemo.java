package classes.results;


//1. Method overloading is performed within class.
//2. In case of method overloading, parameter must be different.
//3. Method overloading is the example of compile time polymorphism.
class OverloadingExample
{  
	static int add(int a,int b)
	{
		return a+b;
	}  
	
	static float add(float a, float b){
		return a+b;
	}  
} 

//1. Method overriding occurs in two classes that have IS-A (inheritance) relationship.
//2. In case of method overriding, parameter must be same.
//3. Method overriding is the example of run time polymorphism.

class Animal{  
	void eat(){
		System.out.println("eating...");
	}  
}  
class Dog extends Animal{  
	void eat(){
		System.out.println("eating bread...");
	}  
}  

public class PolymorphismDemo {

	public static void main(String[] args) {
		System.out.println(OverloadingExample.add(1, 2));
		System.out.println(OverloadingExample.add(1.0f, 2.0f));
		
		Animal animal = new Animal();
		animal.eat();
		Dog dog = new Dog();
		dog.eat();
		
		Animal animal1 = new Dog();
		animal1.eat();  
		
		String str = "23";
		int i = Integer.parseInt(str);
		System.out.println(i);
	}



}
