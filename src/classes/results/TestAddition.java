package classes.results;

public class TestAddition implements Addition{

 	@Override
	public int add(int a ,int b) { 
		return a+b; 
	}

	@Override
	public void display() {
		System.out.println(" Addition :" + add(2,2)); 
	}

}
