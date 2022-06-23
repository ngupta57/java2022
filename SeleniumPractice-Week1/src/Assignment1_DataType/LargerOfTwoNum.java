package Assignment1_DataType;

public class LargerOfTwoNum {
	
	void checkLargerNum(int Num1,int Num2) {
		if (Num1==Num2) {
			System.out.println("Both the numbers are equal " + Num1 + " &  " + Num2);
		                }
		else if (Num1 > Num2) {
			System.out.println( "Num 1 is greater than Num 2 " + Num1  + " &  " + Num2);
		                      } 
		else 
			System.out.println( "Num 2 is greater than Num 1 " + Num1 + " &  " + Num2);
		}
	
	public static void main(String args[]) {
		LargerOfTwoNum BigNum = new LargerOfTwoNum ();
		BigNum.checkLargerNum(23, 24);
		BigNum.checkLargerNum(2, 2);
	}
	}


