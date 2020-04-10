package oops.abstractclass;

public class HsbcBank extends  Bank {

	@Override
	public void bankStamtMsg() {
	System.out.println("This is january month bank statement");
		
	}

	@Override
	public void overdraftmsg() {
	System.out.println("This month onwards overdraft interest rate are going to change by 5.25%");
		
	}

	@Override
	public void mortgagedeatails() {
		System.out.println("good news : coming next 3 months no need pay loans  ");
		
	}
	public static void main(String[] args) {
		Bank obj1= new HsbcBank();
		obj1.getacdetails();
		obj1.bankStamtMsg();
		obj1.overdraftmsg();
		obj1.mortgagedeatails();
		
		
	}

}
