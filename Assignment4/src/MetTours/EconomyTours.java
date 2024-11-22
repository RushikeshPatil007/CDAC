package MetTours;

public class EconomyTours {

	public double getDaysRent(int days, int noPersons) {
		double rent = 500;
		double totalrent = rent * days * noPersons;
		return totalrent;
	}

}
