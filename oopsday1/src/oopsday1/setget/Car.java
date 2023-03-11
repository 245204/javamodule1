package oopsday1.setget;

public class Car {
	private String color;  //instance or data variables color price etc have class scope
	private double price;
	private String brand;
	private String model;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
	this.color = color;
	}
	public double getPrice() {
		return price;
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
