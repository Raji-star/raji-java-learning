package classobjectconstructor;

public class Shoesconstuctor {

	// Variables
	double size;
	String colour;
	String model;
	double price;
	int quantity;

	// Constructor
	Shoesconstuctor(double sizefromcaller, String colourfromcaller, String modelfromcaller, double pricefromcaller,
			int quantityfromcaller) {
		size = sizefromcaller;
		colour = colourfromcaller;
		model = modelfromcaller;
		price = pricefromcaller;
		quantity = quantityfromcaller;
	}

	// Methods
	public void getprice() {
		System.out.println("price=" + price);
	}
public void getshoesmodel() {
		System.out.println("order shoes for siddu");
	}

	public static void main(String[] args) {
		Shoesconstuctor obj1 = new Shoesconstuctor(8.5, "black", "trainers", 45.67, 2);
		System.out.println(obj1.model);
		System.out.println(obj1.price);
		obj1.getprice();
		Shoesconstuctor obj2 = new Shoesconstuctor(8, "brown", "formalshoes", 36.2, 1);
		System.out.println(obj2.colour);
		System.out.println(obj2.model);
		System.out.println(obj2.price);
		obj1.getprice();
		obj2.getshoesmodel();
	}
}
