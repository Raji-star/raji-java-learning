package constructoroverloading;

public class EmployConstuctorOverloading {
//variables
	int empNo;
	String empName;
	double empSal;

	// constructor without parameters
	EmployConstuctorOverloading() {

		empNo = 10;
		empName = "Arush";
		empSal = 200000.00;
	}

	// constructor with 3 parameters
	EmployConstuctorOverloading(int empNofrom, String empNamefrom, double empSalfrom) {
		empNo = empNofrom;
		empName = empNamefrom;
		empSal = empSalfrom;

	}

	// CONSTRUCTOR WITH 2 PARAMETERS
	EmployConstuctorOverloading(String empNamefrom, double empSalfrom) {

		empName = empNamefrom;
		empSal = empSalfrom;
	}

	public void getemployName() {
		System.out.println("employ Name is" + empName);
	}

	public void getemptotsal() {
		double totalsalary = (empSal * 12);
		System.out.println("total salary:" + totalsalary);
	}

	public static void main(String[] args) {

		EmployConstuctorOverloading obj1 = new EmployConstuctorOverloading();
		System.out.println(obj1.empNo);
		System.out.println(obj1.empName);
		System.out.println(obj1.empSal);
		obj1.getemptotsal();

		EmployConstuctorOverloading obj2 = new EmployConstuctorOverloading(20, "rajeshwari", 5000.00);
		System.out.println(obj2.empNo);
		System.out.println(obj2.empName);
		System.out.println(obj2.empSal);
		obj2.getemptotsal();

		EmployConstuctorOverloading obj3 = new EmployConstuctorOverloading("SATISH", 10000.00);
		System.out.println(obj3.empName);
		System.out.println(obj3.empSal);
		obj3.getemptotsal();

	}

}
