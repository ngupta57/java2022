package Assignment1_DataType;

public class FindOddEvenNum {
	void FindOddEven (int Number) {
		if (Number % 2 == 0) {
			System.out.println("The NUMBER IS EVEN NUMBER " + Number);
			}
		else
			System.out.println("The NUMBER IS odd NUMBER " + Number);		
			
	}
	public static void main(String[] args) {
		FindOddEvenNum findodd =new FindOddEvenNum();
		findodd.FindOddEven(23);
		findodd.FindOddEven(22);
	}
}