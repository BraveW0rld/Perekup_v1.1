import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Advise {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	
	Scanner scan = new Scanner(System.in);
	
	ListOfCars lCars = new ListOfCars();
	Calculation calc = new Calculation();
	
	int[] ecoCarsId = lCars.getCarId();
	String[] ecoCarsName = lCars.getCarName();
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US); // Locale
		DecimalFormat formatPrice = new DecimalFormat("#,###", symbols); // Format
	int[] ecoCarsPrice = lCars.getCarPrice();
	
	void advise(int id) {
		
		double diff = 0;

			System.out.println("Введите стоимость авто:");
			double vvodEcoPrice = scan.nextDouble();
			diff = (ecoCarsPrice[id] * 0.75) - vvodEcoPrice;

			if(diff >= 15000) {
				System.out.println(ANSI_GREEN + "		Совет:	Отличный шанс купить авто по привлекательной цене!" + ANSI_RESET);
			} else {
				System.out.println(ANSI_RED + "		Совет: Не стоит брать!" + ANSI_RESET);
		}

	}
	
}
