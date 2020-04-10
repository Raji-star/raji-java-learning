package oops.java.polymorphism;

public class PolyMethodOverloading {
	//int empNo;
	//String empName;
	//double empSal;
	//METHOD OVERLOADING
	public void getEmpDetails(int empNo,String empName) {
		System.out.println(empNo);
	}
	public void  getEmpDetails( double empSal) {
		System.out.println(empSal);
		
	}
	public void  getEmpDetails(String empName) {
		System.out.println(empName);
	}
	public static void main(String[] args) {
		PolyMethodOverloading obj1=new PolyMethodOverloading ();
		obj1.getEmpDetails(1);
		obj1.getEmpDetails(6700);
		obj1.getEmpDetails("raji");
		
		
	}
	

}
