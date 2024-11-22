package MetTours;
//import java.lang.annotation.Annotation;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		/*
		 * EconomyTours obj=new EconomyTours(); System.out.println("For EconomyTours");
		 * System.out.println(obj.getDaysRent(2, 3)); PremiumTours obj1=new
		 * PremiumTours(); System.out.println("For Common:");
		 * System.out.println(obj1.getDaysForCommon(3, 4));
		 * System.out.println("For Seniors:");
		 * System.out.println(obj1.getDaysForSeniors(3, 4));
		 * System.out.println("For Woman:"); System.out.println(obj1.getDaysForWoman(3,
		 * 4));
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of days:");
		int days = scanner.nextInt();

		System.out.println("Enter no of Persons:");
		int noPersons = scanner.nextInt();

		EconomyTours obj = new EconomyTours();
		PremiumTours obj1 = new PremiumTours();
		System.out.println("For Economy Tours ");
		System.out.println(obj.getDaysRent(days, noPersons));

		System.out.println("Total rent for Common:");
		double premiumRentforCommon=applyLuxuryTax(obj1.getDaysForCommon(days,noPersons),PremiumTours.class);
		System.out.println("For Common Rent with Tax: Rs " + premiumRentforCommon);
		
		System.out.println("Total rent for Seniors:");
		double premiumRentforSeniors=applyLuxuryTax(obj1.getDaysForSeniors(days,noPersons),PremiumTours.class);
		System.out.println("For Seniors Rent with Tax: Rs " + premiumRentforSeniors);
		
		System.out.println("Total rent for Woman:");
		double premiumRentforWoman=applyLuxuryTax(obj1.getDaysForWoman(days,noPersons),PremiumTours.class);
		System.out.println("For Common Rent with Tax: Rs " + premiumRentforWoman);
		
		scanner.close();
		
	}
	
	private static double applyLuxuryTax(double baseRent,Class<?> tourClass) {
		if(tourClass.isAnnotationPresent(LuxuryTax.class)) {
			LuxuryTax taxAnnotation=tourClass.getAnnotation(LuxuryTax.class);
			int taxRate=taxAnnotation.value();
			double taxAmount=baseRent * taxRate/100.0;
			return baseRent + taxAmount;
			
		}
		return baseRent;
	}
}
