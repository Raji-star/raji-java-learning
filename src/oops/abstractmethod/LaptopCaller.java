package oops.abstractmethod;

public class LaptopCaller implements Laptop{

	@Override
	public void screen() {
	 System.out.println("DEll Laptop having touch screen");
		
	}

	@Override
	public void keybord() {
	System.out.println("DELL Laptop having touch keybord");
	
		
	}

	@Override
	public void processor() {
	System.out.println(" DEll Laptop having i7 processor");
		
	}

	@Override
	public void size() {
		System.out.println("DEll Laptop having 15.5 inch size");
		
	}
	public void brandNAME()
	{ System.out.println("dell");
	
	}
	public static void main(String[] args) {
		
		LaptopCaller obj1= new LaptopCaller();
		obj1.screen();
		obj1.keybord();
		obj1.processor();
		obj1.size();
		obj1.brandNAME();
		
		
	}
	
	
	


}
