package restaurant;

public class RoomGuest {

	public static void main(String args[]) {
		RoomService rs = new RoomService(new AsianKitchen());
		System.out.println(rs.takeOrder("Spring rolls"));
		
		RoomService rs1 = new RoomService(new ItalianKitchen());
		System.out.println(rs1.takeOrder("Supreme pizza"));
	}
}
