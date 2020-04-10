package javaencapsulation;

public class EncapsulationProduct {
	//variables
	int proId;
	private String proName;
	int proQuantity;
	private double proPrice;
	
	//constructor with parameters
	EncapsulationProduct(int proIdfrom,String proNamefrom,int proQuantityfrom,double proPricefrom ){
		proId=proIdfrom;
		proName=proNamefrom;
		proQuantity=proQuantityfrom;
		proPrice=proPricefrom;
	}
	//methods
		
		public void getproductId() {
			System.out.println(proId);			
					}
		
		public void getproductPrice(){
			double price=proPrice*proQuantity;
			System.out.println(price);
		}
//GETTERS AND SETTERS METHODS
		public String getProName() {
			return proName;
		}

		public void setProName(String proName) {
			this.proName = proName;
		}

		public double getProPrice() {
			return proPrice;
		}

		public void setProPrice(double proPrice) {
			this.proPrice = proPrice;
		}
		
		
		
		
	}
	


