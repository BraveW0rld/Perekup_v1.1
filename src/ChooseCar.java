import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class ChooseCar {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	
	Scanner scan = new Scanner(System.in);
	
	ListOfCars lCars = new ListOfCars();
	Calculation calc = new Calculation();
	Advise advicing = new Advise();
	
	int[] carsId = lCars.getCarId();
	String[] carsName = lCars.getCarName();
	
	DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US); // Locale 
	DecimalFormat formatPrice = new DecimalFormat("#,###", symbols); // Format
	int[] carsPrice = lCars.getCarPrice();
	
	void chooseCar(int id) {
		double percPrice50 = 0;
		double percPrice75 = 0;
			
		for(int i = 0; i < carsId.length;) {
			
			i = id - 1;

            System.out.print(carsId[i] + " / ");
            System.out.print(ANSI_YELLOW + carsName[i] + ANSI_RESET + " / ");
            System.out.println(formatPrice.format(carsPrice[i]));
            
    		percPrice50 = calc.calculate50(id - 1);
    		System.out.println("Продажа авто в госс при 50%: " + ANSI_RED + formatPrice.format(percPrice50) + ANSI_RESET);
    		percPrice75 = calc.calculate75(id - 1);
    		System.out.println("Продажа авто в госс при 75%: " + ANSI_RED + formatPrice.format(percPrice75) + ANSI_RESET);
    		
    		printAdvice();
    		int choose = scan.nextInt();
    		
    		if(choose == 1) {
    			advicing.advise(i);
    		} else return;
    		
    		break;
		}
				}
	
	void printAdvice() {
		System.out.println(ANSI_GREEN + "\nХотите получить совет о покупке?" + ANSI_RESET + "\nЕсли да, то введите 1. В ином случае введите 0");
	}
}