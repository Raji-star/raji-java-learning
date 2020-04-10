package oops.abstractmethod;

public class MacLaptop implements Laptop {

	@Override
	public void screen() {
	System.out.println(" touch and normal screen");
		
	}

	@Override
	public void keybord() {
	System.out.println("electric keyboard");
		
	}

	@Override
	public void processor() {
	System.out.println("i10 processor");
		
	}

	@Override
	public void size() {
		System.out.println("13 inch screen");
	}
	public static void main(String[] args) {
		 MacLaptop obj1= new  MacLaptop();
		 obj1.screen();
		 obj1.keybord();
		 obj1.processor();
		 obj1.size();
		

	}
}