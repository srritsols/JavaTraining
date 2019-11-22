package inheritance.practice.nitesh;

public class Vehicle {
int year;
String make;
String model;
String tier;
String engine;


public Vehicle(int year, String make, String model, String tier, String engine) {
	super();
	this.year = year;
	this.make = make;
	this.model = model;
	this.tier = tier;
	this.engine = engine;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getTier() {
	return tier;
}
public void setTier(String tier) {
	this.tier = tier;
}
public String getEngine() {
	return engine;
}
public void setEngine(String engine) {
	this.engine = engine;
}
@Override
public String toString() {
	return "Vehicle [year=" + year + ", make=" + make + ", model=" + model + ", tier=" + tier + ", engine=" + engine
			+ "]";
}

}
