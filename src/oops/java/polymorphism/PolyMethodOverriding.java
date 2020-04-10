package oops.java.polymorphism;

public class PolyMethodOverriding {
	
	int a=10;
	int b=5;
	int sum=a+b;
	public void getSum() {
		System.out.println("Addition is"+sum);
		
	}
	public void getSum(int d) {
	
	System.out.println(+d); 
	}
	public void getMul() {
		int mul=a*b;
		System.out.println("Multipication is:"+mul);
		
	}
	

}
