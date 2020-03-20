package classandobject;

public class Tshirt {
	//Variables
	int orderNo = 100;
	int quantity = 3;
	String size = "small";
	String model = "poloshirt";
	String colour = "checkswithblue";
	double price = 30;
	double tax = 0.15;
	String delivaryAddress = "mk44ht";

	
	//Methods
	public void makeanOrderMethod() {
		System.out.println("i have ordered shirt");
	}

	public void cancelanOrderMethod() {
		System.out.println("Cancel an rder");
	}

	public void returnanItemMethod() {
		System.out.println("Return an Item");
	}

}