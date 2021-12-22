package inheritance.autoshop.one;

public class Car {
	
    // variable - are not allowed to access
	private int speed;
	private double regularPrice;
	private String color;
	
	// constructor 
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	// is a user defined method.
	public double getSalePrice(){
		return getRegularPrice();//5000 return <method>
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public double getRegularPrice() {
		return regularPrice;//5000
	}

	public void setRegularPrice(double regularPrice) { // 5000
		this.regularPrice = regularPrice;//5000
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}