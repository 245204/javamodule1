package oopsday1.setgetconstructors;

public class Car {
	private String color;  //instance or data variables color price etc
	private double price;
	private String brand;
	private String model;
	
	public Car() {
		// TODO Auto-generated constructor stub default constructor 
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public Car(String color, double price, String brand, String model) {
		this.color = color;
		this.price = price;
		this.brand = brand;
		this.model = model;
	}
	@Override
	public String toString() {
		return "I am a "+ brand;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	


}
