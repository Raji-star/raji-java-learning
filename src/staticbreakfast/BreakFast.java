package staticbreakfast;

public class BreakFast {
	String monday;
	String tuesday;
	String friday;
	static String common = "milk";

	BreakFast(String mondayfrom, String tuesdayfrom, String fridayfrom) {
		monday = mondayfrom;
		tuesday = tuesdayfrom;
		friday = fridayfrom;
	}

	public void getmondaybf() {
		System.out.println("Monday Breakfast is:" + monday);
	}

	public void gettuesdaybf() {
		System.out.println("Tuesday Breakfast is:" + tuesday);
	}

	public void getfridaybf() {
		System.out.println("Friday Breakfast is:" + friday);
	}

	public static void main(String[] args) {
		BreakFast obj1 = new BreakFast("dosa", "puri", "idly");
		BreakFast obj2 = new BreakFast("upma", "oats", "chapathi");
		obj1.getmondaybf();
		obj1.gettuesdaybf();
		obj1.getfridaybf();
		System.out.println(obj1.monday);
		System.out.println(obj1.tuesday);
		System.out.println(obj1.friday);
		System.out.println(BreakFast.common);
		obj2.getmondaybf();
		obj2.gettuesdaybf();
		obj2.getfridaybf();
		System.out.println(obj2.monday);
		System.out.println(obj2.monday);
		System.out.println(obj2.tuesday);
		System.out.println(obj2.friday);
		System.out.println(BreakFast.common);
	}
}
		
	
	
