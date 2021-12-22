package inheritance.autoshop.one;

public class Ford extends Car {

	private int year;
	private int manufacturerDiscount;
	
	public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount){
		super(speed, regularPrice, color);//access the members of parent class car
		this.year = year;
		this.manufacturerDiscount = manufacturerDiscount;
	}
	//same method in derived class
	public double getSalePrice(){
	
		return super.getSalePrice() - manufacturerDiscount;
	} 

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getManufacturerDiscount() {
		return manufacturerDiscount;
	}

	public void setManufacturerDiscount(int manufacturerDiscount) {
		this.manufacturerDiscount = manufacturerDiscount;
	}

}