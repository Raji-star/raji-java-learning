package customerinheritance;

public class CustomerBalance {
	String  customerAcNo;
	double creditBalance;
	double debitBalance;
	
	CustomerBalance(String  customerAcNofrom,double creditBalancefrom,double debitBalancefrom){
		customerAcNo=customerAcNofrom;
		creditBalance=creditBalancefrom;
		debitBalance=debitBalancefrom;
		
			}
	public void getcustomerbal() {
		System.out.println("customer credit balance is:" +creditBalance);
	}
	
public static void main(String[] args) {
	CustomerBalance obj1= new CustomerBalance("34455667",2500,50000);
	System.out.println(obj1.customerAcNo);
	System.out.println(obj1.creditBalance);
	System.out.println(obj1.debitBalance);
	System.out.println("**************************");
	CustomerBalance obj2= new CustomerBalance("94455669",4500,60000);
	System.out.println(obj2.customerAcNo);
	System.out.println(obj2.creditBalance);
	System.out.println(obj2.debitBalance);
	System.out.println("****************************");
	CustomerBalance obj3= new CustomerBalance("74455667",5500,80000);
	System.out.println(obj3.customerAcNo);
	System.out.println(obj3.creditBalance);
	System.out.println(obj3.debitBalance);
	System.out.println("****************************");
	
	
	
	
	}
}
