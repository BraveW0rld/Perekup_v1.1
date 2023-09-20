import java.util.Scanner;

public class Main {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final int ecoCars = 25;
	public static final int comfortCars = 23;
	
	
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		ListOfCars lCars = new ListOfCars();
		ChooseCar chooseCar = new ChooseCar();
		
		while (true) {
            printMenu();
            int command = scan.nextInt();

            if (command == 1) {
        		System.out.println("=============================================");
            	System.out.println("Выберите класс:\n1 - Эконом\n2 - Комфорт\n3 - Все авто");
        		System.out.println("=============================================");
                int type = scan.nextInt();
                
                	if(type == 1) {
                		System.out.println("=============================================");
                		System.out.println(ANSI_RED + "	Вот список авто " + ANSI_GREEN + "ЭКОНОМ " +  
 				   			ANSI_RED + "класса:\nID / Название / Цена(в салоне)" + ANSI_RESET);
                			lCars.listByClass(ecoCars); // Call func listByClass for Econom Cars
                		System.out.println("=============================================");
                	} else if(type == 2) {
                		System.out.println("=============================================");
                		lCars.listByClass(comfortCars); // Call func listByClass for Comfort Cars
                		System.out.println("=============================================");
                	} else if(type == 3) {
                		System.out.println("=============================================");
                		System.out.println(ANSI_RED + "	Вот список всех авто :\nID / Название / Цена(в салоне)" + ANSI_RESET);
                		lCars.listOfAllCars();
                		System.out.println("=============================================");
                	} else {
                		System.out.println("\nНеверная команда. Попробуй еще раз, у тебя получится! \n ＼(￣▽￣)／ \n");
                		break;
                	}		
                
            } else if (command == 2) {
        		System.out.println("Введите ID авто:");
        		int id = scan.nextInt();
        		System.out.println("=============================================");
        		chooseCar.chooseCar(id); // Call func "chooseCar" from "ChooseCar" class
        		System.out.println("=============================================");
            } else if (command == 3) {
        		System.out.println("Введите ID авто:");
        		int id = scan.nextInt();
        		
        		if(id > 0 && id <= 25) {
        		System.out.println("=============================================");
        		lCars.infoForId(id); // Call func "chooseCar" from "ListOfCars" class for ID
        		System.out.println("=============================================");
        		} else if(id > 25) {
        			System.out.println("=============================================");
            		lCars.infoForId(id); // Call func "infoForId" from "ListOfCars" class for ID
            		System.out.println("=============================================");
        		}
        		
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("\nНеверная команда. Попробуй еще раз, у тебя получится! \n ＼(￣▽￣)／ \n");
            }
        }
    }
	
	public static void printMenu() {
		System.out.println("=============================================");
		System.out.println(ANSI_YELLOW + "Введите номер команды:" + ANSI_RESET);
		System.out.println("1 - Показать список авто");
		System.out.println("2 - Расчет выгоды и рекомендация по покупке");
		System.out.println("3 - Вывод информации по ID");
		System.out.println("0 - Выход");
		System.out.println("=============================================");
	}
}
