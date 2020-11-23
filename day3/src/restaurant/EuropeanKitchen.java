package restaurant;

public class EuropeanKitchen implements Kitchen{

	@Override
	public String cookFood(String foodName) {
		return ("Food is prepared by European kitchen with dish "+foodName);
		
	}

}
