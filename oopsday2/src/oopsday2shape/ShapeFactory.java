package oopsday2shape;

public class ShapeFactory {

	public static void main(String[] args) {
      ShapeIface s1 = new rectangle(3,4);
      System.out.println(s1);
      s1.area();
      
	}
	

}
