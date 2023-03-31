package demo;
class Wecp1 {
	 class Outer_Demo {
		  private int num = 175; 
		 public class Inner_Demo {
		  public int getNum() {
		  
		  return num;
		  }
		 }
		 }
		 
		  public class My_class2 {
		  public static void main(String args[]) {
		 Wecp1 outer = new Wecp1(); 
		  Wecp1.Inner_Demo inner = outer.newInner_Demo();
		 System.out.println(inner.getNum());
		 }
		  }
}
