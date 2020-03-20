package classandobjectemp;

public class EmpConstructor {

	int empNo;
	String empName;
	double empSal;
	String empMailid;
	String empAddress;
	String empPhno;

	EmpConstructor(int empNofromcaller, String empNamefromcaller, double empSalfromcaller, String empMailidfromcaller,
			String empAddressfromcaller, String empPhnofromcaller) {
		empNo = empNofromcaller;
		empName = empNamefromcaller;
		empSal = empSalfromcaller;
		empMailid = empMailidfromcaller;
		empAddress = empAddressfromcaller;
		empPhno = empPhnofromcaller;

	}

	public void getEmpName() {
		System.out.println("employ name is:" + empName);
	}

	public void getEmpSal() {
		System.out.println("employ salary is:" + empSal);
	}

	public static void main(String[] args) {

		EmpConstructor obj1 = new EmpConstructor(22, "Siddu", 500000, "siddu@gmail.com", "mk44ht", "07448143266");
		obj1.getEmpName();
		obj1.getEmpSal();
		System.out.println(obj1.empMailid);
		System.out.println(obj1.empAddress);

		EmpConstructor obj2 = new EmpConstructor(23, "Raji", 1000000, "raji@gmail.com", "mk44ht", "07448143266");
		obj2.getEmpName();
		obj2.getEmpSal();
		System.out.println(obj2.empMailid);
		System.out.println(obj2.empAddress);

	}
}
