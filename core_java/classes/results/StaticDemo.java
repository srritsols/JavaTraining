package classes.results; 

//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  

class StaticDemo{  
	
int count=0;//will get memory each time when the instance is created  

StaticDemo(){  
	count++;//incrementing value  
	System.out.println(count);  
}  

public static void main(String args[]){  
//Creating objects  
	StaticDemo c1=new StaticDemo();  
	StaticDemo c2=new StaticDemo();  
	StaticDemo c3=new StaticDemo();  
}  
}  