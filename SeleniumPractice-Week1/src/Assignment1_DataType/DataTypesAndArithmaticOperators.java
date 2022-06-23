package Assignment1_DataType;

public class DataTypesAndArithmaticOperators {

	public static void main(String[] args) {
		//
		
		int cars=5;
		double Purchaseprice=1000.50;
		double SalePrice= 1200.75;
		double profit;
		//used multiplication
		double totalcost = cars* Purchaseprice;
		double totalsale= cars* SalePrice;
		// used subtraction
		profit= totalsale-totalcost;
		System.out.println("we have made a total profit of usd: "+ profit);
		byte NoOfPartners=5;
		//used division
		double EachPartnershare = profit/NoOfPartners;
		System.out.println("Each Partner in the sale of car  made a profit of : " +EachPartnershare);
		
		int Price = 19;
		int salesTax=1;
		int sellingcost= 1;
		int totalsellingcost= Price+salesTax+sellingcost;
		System.out.println("totalsellingcost: " + totalsellingcost);
		
		for (int i = 5; i>0; i--) {
			System.out.println("I have learnt how to use Arithmatic operators in Java" );
		}
			for (int j=0; j<5; j++) {
				System.out.println("Learn More--not enough" );
			}

	}

}
