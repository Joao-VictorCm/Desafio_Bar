package application;

public class Bill {
	public static char gender;
	public static int beer;
	public static int barbecue;
	public static int softDrink;
	
	
	

	public static double feeding(int beer, int barbecue, int softDrink) {
		return (beer * 5) + (barbecue *7) + (softDrink * 3);
	}

	public static double ticket(char gender) {
		if(gender == 'M') {
			return 10.00;
		}else {
			return 8.00;
		}
	}
	
	public static double cover(double feeding) {
		if(feeding  > 30.00) {
			return 0.00;
		}else {
			return 4.00;
		}
	}

	public static double total(double feeding, double ticket, double cover){
		return feeding(beer, barbecue, softDrink) +ticket +cover(feeding);
	}
}
