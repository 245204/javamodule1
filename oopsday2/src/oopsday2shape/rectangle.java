package oopsday2shape;

public class rectangle implements ShapeIface {
	private double length;
	private double breadth;
	
	public rectangle()  //default constructor
	{
		
	}
	public rectangle(double length, double breadth) {   //parameterized constructor
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	@Override
	public String toString() {
		return "Shape [length=" + length + ", breadth=" + breadth + "]";
	}
	@Override
	public void area()
	{
		double areaRectangle = length*breadth;
		System.out.println(areaRectangle);
	}
}
