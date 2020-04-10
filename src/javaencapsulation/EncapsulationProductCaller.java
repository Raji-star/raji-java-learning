package javaencapsulation;

public class EncapsulationProductCaller {
	public static void main(String[] args) {
		
		EncapsulationProduct obj1 = new EncapsulationProduct(1,"Raji",3,11);
		System.out.println(obj1.proId);
		System.out.println(obj1.proQuantity);
		obj1.getproductId();
		obj1.getproductPrice();
		System.out.println(obj1.getProName());
		System.out.println("............");
		
		obj1.setProName("satish");
		System.out.println(obj1.getProName());

		obj1.setProPrice(305.78);
		System.out.println(obj1.getProPrice());
		
		
	}

}
