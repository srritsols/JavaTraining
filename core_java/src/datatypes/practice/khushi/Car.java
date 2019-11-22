package datatypes.practice.khushi;

public class Car {
	
 private int yearModel;
 private String brand;
 private String color;
 private int price;
 private int speed;
 
 public Car() {
		
	 yearModel =2019;
	 brand = "Tesla";
	 color = "black";
	 price = 40419;
	 speed = 169;
	 
 }
 
 public Car(String brand,String color, int yearModel,int price,int speed) {
	 this.brand = brand;
	 this.color = color;
	 this.yearModel =  yearModel;
	 this.price = price;
	 this.speed=  speed; 
 }
 
 public int getYear() {
	 return yearModel;
	 //just for references
 }
 public String getBrand() {
	 return brand;
	 
 }
 public String getColor() {
		return color;
	
	}
 public int getPrice() {
	 return price;
	 
 }
 public int getSpeed() {
	 return speed;
	
 }
  	
 
 public void getFeature() {
	 if(getBrand() == "Honda") {
		 System.out.println("It is a manual car"); 
	 }else if(getBrand() == "Acura") {
		 System.out.println("It has hybrid feature");
	 }else {
		 System.out.println("It has auto pilot feature");
	 }
 }
 
 public void getCost() {
	 int price = 41500;
	 switch (price) {
	 case 30000:
	 System.out.println("Acura cost around 30K");
	 break;
	 case 40419:
	 System.out.println("Tesla cost around 40K");
	 break;
	 case 41500:
	 System.out.println("Lexus cost around 41K");
	 break;
	 }
 }
	 
} 



	
	 
	



