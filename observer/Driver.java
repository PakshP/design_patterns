package observer;

public class Driver {

	public void run() {
		Cook heinzenberg = new Cook("Heinzenberg");
		Observer dea = new Police(heinzenberg);
		Observer cartel = new Cartel(heinzenberg);

		System.out.println("##### " + heinzenberg.getName() + " is Breaking Bad #####");
		heinzenberg.enterSighting("School Chemistry Lab", "Meeting", "Jessie");
		heinzenberg.enterSighting("RV in the desert", "Cooking", "Jessie");
		heinzenberg.enterSighting("Laundrymat", "Doing his Laundry...", "Wife, Child");
		heinzenberg.enterSighting("Car Wash", "Laundering Money", "Wife, Client");
		heinzenberg.enterSighting("Lawyer", "Strategizing", "Saul, Jessie");

		System.out.println("\n##### DEA Notes #####");
		System.out.println(dea.getLog());

		System.out.println("\n##### Cartel Notes #####");
		System.out.println(cartel.getLog());
	}

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.run();
	}
}
