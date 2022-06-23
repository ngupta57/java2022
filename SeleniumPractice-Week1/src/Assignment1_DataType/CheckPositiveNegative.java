package Assignment1_DataType;

public class CheckPositiveNegative {
	
	void checknumber (int NumToCheck) {
		if (NumToCheck<0) {
			System.out.println("The Given Number is a Negative Number " + NumToCheck);
		}else if (NumToCheck>0) {
			System.out.println(" The given Number is positive :" + NumToCheck);
			}else
				System.out.println(" The given Number is zero, Nether Positive or Negative :" + NumToCheck);
			}
	public static void main(String args[]) {
		CheckPositiveNegative ChkPoNe = new CheckPositiveNegative();
		ChkPoNe.checknumber(-3);
		ChkPoNe.checknumber(0);
		ChkPoNe.checknumber(5);
	}
	
}


