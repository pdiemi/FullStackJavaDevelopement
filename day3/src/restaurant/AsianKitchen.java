package restaurant;

public class AsianKitchen implements Kitchen {

	@Override
	public String cookFood(String foodName) {
		return ("Food is prepared by Asian kitchen with dish "+foodName);
		
	}

}
