package If_Statement;

public class ConditionalAndOr {

	public static void main(String[] args) {
		//this programme shows example of && or
		
		int salary1 =500;
		int salary2=2000;
		if (salary1 >1000 && salary2 >= 2000) {
			System.out.println("salary is in range  :" + salary1);
		}
		else if (salary1 < 1000 || salary2 >3000) {
			System.out.println("salary is not in range");
		}

	}

}
