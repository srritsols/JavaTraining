package collections.practice;

import java.math.BigDecimal;

public class Staff {

    private String name;
    private int age;
    private BigDecimal salary;
    
    public Staff(String name, int age, BigDecimal salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	 
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public BigDecimal getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}  
	
	
	 
}
