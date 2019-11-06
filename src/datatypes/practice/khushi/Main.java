package datatypes.practice.khushi;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(); 
		Car car1 = new Car("Lexus","Red",2019,41500,215);
		Car car2= new Car("Acura","Black",2019,30000,140);
		
		car.getFeature(); 
		car.getCost();
		
		car1.getFeature(); 
		car1.getCost();
		
		car2.getFeature(); 
		car2.getCost();
		
		  
		
	}
}

