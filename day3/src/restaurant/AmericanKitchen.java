package restaurant;

public class AmericanKitchen implements Kitchen {

	@Override
	public String cookFood(String foodName) {
		return ("Food is prepared by American kitchen with dish "+foodName);
		
	}

}
