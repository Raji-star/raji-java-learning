package oops.java.polymorphism;

public class PolyDiv extends  PolyMethodOverriding{
	public void getSum() {
		System.out.println("Addition of two numbers is:"+sum);
	}
	public void getDiv() {
		System.out.println("Division is :" +a/b);
	}
	public static void main(String[] args) {
		PolyDiv obj1= new PolyDiv();
		obj1.getSum();
		obj1.getDiv();
		obj1.getSum(15);
	
	}

}
