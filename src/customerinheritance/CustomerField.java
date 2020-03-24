package customerinheritance;

public class CustomerField extends CustomerBalance{
	// variables
	String customerName;
	String customerAcNo;
	int customerSc;
	String customerAddress;
	String PostCode;

	// constructor
	CustomerField(String customerNamefrom, String customerAcNofrom, int customerScfrom, String customerAddressfrom,
			String PostCodefrom) {
		super(String  customerAcNofrom,double creditBalancefrom,double debitBalancefrom);
		customerName = customerNamefrom;
		customerAcNo = customerAcNofrom;
		customerSc = customerScfrom;
		customerAddress = customerAddressfrom;
		PostCode = PostCodefrom;

	}

// methods
	public static void main(String[] args) {

		CustomerField obj1 = new CustomerField("Arush", "34455667", 406732, "138 Holden Avenue", "MK44HT");
		System.out.println(obj1.customerName);
		System.out.println(obj1.customerAcNo);
		System.out.println(obj1.customerSc);
		System.out.println(obj1.customerAddress);
		System.out.println(obj1.PostCode);
		System.out.println("********************");

		CustomerField obj2 = new CustomerField("Ayansh", "94455669", 806738, "139 Holden Avenue", "MK44HT");
		System.out.println(obj2.customerName);
		System.out.println(obj2.customerAcNo);
		System.out.println(obj2.customerSc);
		System.out.println(obj2.customerAddress);
		System.out.println(obj2.PostCode);
		System.out.println("********************");

		CustomerField obj3 = new CustomerField("satish", "74455667", 606736, "23 Holden Avenue", "MK44HT");
		System.out.println(obj3.customerName);
		System.out.println(obj3.customerAcNo);
		System.out.println(obj3.customerSc);
		System.out.println(obj3.customerAddress);
		System.out.println(obj3.PostCode);

	}
}
