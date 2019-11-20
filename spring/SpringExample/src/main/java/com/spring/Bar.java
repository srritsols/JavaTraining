package com.spring;
 
public class Bar 
{
	private String name;
	private int age;
	
	private Foo foo;
	
	public Bar() {
		
	}
	  
	public Bar(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	} 
	
	
	public void setFoo(Foo foo) {
		this.foo = foo;
	}
 
	public void processFooName() {
		System.out.println("Name is injected Foo is :" + foo.getName());
	}

	@Override
	public String toString() {
		return "Bar [name=" + name + ", age=" + age + ", foo=" + foo + "]";
	} 
	
}
