package MetTours;

@LuxuryTax(value=10)
public class PremiumTours {

	public double getDaysForCommon(int days, int noPersons) {
		double rent = 1200;
		return calculaterent(rent, days, noPersons);
	}

	public double getDaysForSeniors(int days, int noPersons) {
		double rent = 1200 - 100;
		return calculaterent(rent, days, noPersons);
	}

	public double getDaysForWoman(int days, int noPersons) {
		double rent = 1200 - 200;
		return calculaterent(rent, days, noPersons);
	}

	private double calculaterent(double rent, int days, int noPersons) {
		double totalrent = rent * days * noPersons;
		if (days > 6) {
			totalrent = totalrent - 100 * days * noPersons;
		}
		if (noPersons >= 4) {
			totalrent = totalrent - 100 * days * noPersons;
		}
		return totalrent;
	}
	
	
}
