package If_Statement;

public class Switch_string {

	public static void main(String[] args) {
		// Switch String
		
		String FriendName="Radha";
		switch (FriendName) {
		case "Ram" :
			System.out.println( "value is Ram");
			break;
		case "Rani":
			System.out.println("Name is Rani");
			break;
		case "Radha":
			System.out.println("Name is Radha");
			break;
			
			default:
				System.out.println("no matching value found");
		}
	}

}
