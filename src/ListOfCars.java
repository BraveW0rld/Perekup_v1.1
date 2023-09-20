import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ListOfCars {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final int ecoCars = 25;
	public static final int comfortCars = 23;
	
	int[] carsId = { // List of cars id
			
			1, 2, 3,
			4, 5, 6,
			7, 8, 9,
			10, 11, 12,
			13, 14, 15,
			16, 17, 18,
			19, 20, 21,
			22, 23, 24,
			25, 26, 27,
			28, 29, 30,
			31, 32, 33,
			34, 35, 36,
			37, 38, 39,
			40, 41, 42,
			43, 44, 45,
			46, 47, 48,
			
			}; 
    String[] carsName = { // List of cars names
    		
    		"LADA NIVA", 
    		"VAZ 21099", 
    		"ВАЗ 2107",
            "LADA VESTA",
            "LADA PRIORA",
            "ВАЗ 2109",
            "ВАЗ 2114",
            "MERCEDES S600",
            "MERCEDES W124",
            "OPEL INSIGNIA",
            "SKODA OCTAVIA",
            "SUBARU LEGACY",
            "TOYOTA CELICA",
            "TOYOTA MARK 2",
            "MERC E420",
            "MERCEDES 230",
            "NISSAN CENTRA",
            "VOLKSWAGEN GOLF",
            "VOLKSWAGEN SCIROCCO",
            "MERCEDES 190E",
            "BMW E39 M5",
            "SUPRA A80",
            "M5 E60",
            "OKA",
            "BMW E38",
            "AUDI 3",
            "AUDI A4",
            "CAMRY XV70",
            "MB E63S",
            "HONDA CIVIC SPORT",
            "LAND CRUISER 200",
            "LEXUS IS",
            "MB E63 212",
            "MERC X CLASS",
            "MERCEDES-BENZ CLS63 S AMG",
            "SUBARU IMPREZ",
            "KIA K5",
            "BMW Z4",
            "MITSUBISHI LANCER EVO 9",
            "BMW M4 F82",
            "MERC C63 AMG",
            "TESLA MODEL S",
            "VOLVO XC 90",
            "CADILLAC CT4",
            "KIA RIO",
            "NISSAN SILVIA S15",
            "FORD FOCUS RS",
            "MITSUBISHI LANCER EVO X"
            
    };
		DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US); // Locale
		DecimalFormat formatPrice = new DecimalFormat("#,###", symbols); // Format
    int[] carsPrice = { // List of cars prices

    		150000,
            130000,
            130000,
            300000,
            320000,
            135000,
            120000,
            650000,
            125000,
            390000,
            200000,
            120000,
            230000,
            350000,
            350000,
            225000,
            300000,
            450000,
            630000,
            400000,
            250000,
            700000,
            800000,
            65000,
            850000,
            2500000,
            2800000,
            1300000,
         	3000000,
         	2300000,
         	3500000,
         	1100000,
         	1700000,
         	3860000,
         	2700000,
         	750000,
         	1500000,
         	1800000,
         	900000,
         	5500000,
         	3600000,
         	5900000,
         	5500000,
         	1500000,
         	900000,
         	1500000,
         	2500000,
         	2000000
          
    };
	
	void listOfAllCars() {

        for (int i = 0; i < carsId.length; i++) {
            System.out.print(carsId[i] + " / ");
            System.out.print(ANSI_YELLOW + carsName[i] + ANSI_RESET + " / ");
            System.out.println(formatPrice.format(carsPrice[i]));
        }
		
	}
	
	 void infoForId(int id) {
	    	
	    	id -= 1;
	    	
	    	System.out.println(ANSI_RED + "ID / Название / Цена(в салоне)" + ANSI_RESET);
	    	System.out.print(carsId[id] + " / ");
            System.out.print(ANSI_YELLOW + carsName[id] + ANSI_RESET + " / ");
	        System.out.println(formatPrice.format(carsPrice[id]));
	    }
	 
	 void listByClass(int quantityCars) {

		 if(quantityCars == ecoCars) {
		     for(int i = 0; i < quantityCars; i++) { 
		            System.out.print(carsId[i] + " / ");
		            System.out.print(ANSI_YELLOW + carsName[i] + ANSI_RESET + " / ");
		            System.out.println(formatPrice.format(carsPrice[i]));
		     }
		     
		 } else if(quantityCars == comfortCars) {
		     for(int i = ecoCars; i < carsId.length; i++) {
			            System.out.print(carsId[i] + " / ");
			            System.out.print(ANSI_YELLOW + carsName[i] + ANSI_RESET + " / ");
			            System.out.println(formatPrice.format(carsPrice[i]));
		     }
		     
		 }
		 
	 }
	 
	 public int[] getCarId() {			// Getter cars id
	        return carsId;
	    }
	    
	    public String[] getCarName() {		// Getter cars names		
	        return carsName;
	    }
	    
	    public int[] getCarPrice() {		// Getter cars prices
	        return carsPrice;
	    }
	 
}
