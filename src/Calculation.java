
public class Calculation {
	
	ListOfCars lCars = new ListOfCars();
	
	int[] ecoCarsPrice = lCars.getCarPrice();
	

	double calculate50(int id) {

		double percPriceEco50;
		
		percPriceEco50 = ecoCarsPrice[id] * 0.5;	// Calculate of 50% sell	
		
		return percPriceEco50;
	}
	
	double calculate75(int id) {
	
		double percPriceEco75;
		
		percPriceEco75 = ecoCarsPrice[id] * 0.75;	// Calculate of 75% sell
	
		return percPriceEco75;
	}
	
}
