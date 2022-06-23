package Assignment1_DataType;

public class IF_Condition {

	
		/*if Condition		
		 *  Write a program to check if a candidate is eligible for voting or not.
		 * (Hint: Check age)  Write a program to check if the number is positive or
		 * negative.  Extend the previous program to check whether the given number is
		 * positive, zero or negative. (Hint: use if-else conditions)  Write a program
		 * to find largest of two numbers.  Write a program to check given number is
		 * even or odd. (Hint: use % operator)
		 */
		
		void CheckVotingAge(int Age) {
			int votingage=18;
			if (Age >= votingage)
			{
				System.out.println("you are eligible for voting, as your age is : " + Age  + " which is greater or equal to voting age: " + votingage);
			} else
				System.out.println("Sorry you are not eligible for voting yet as your age is :" +Age + " which is lower than the votingage " +votingage);
			}
		public static void main(String args[]) {
			IF_Condition AgeCond = new IF_Condition();
			AgeCond.CheckVotingAge(19);
			AgeCond.CheckVotingAge(18);
			AgeCond.CheckVotingAge(16);
		}
			
		}
		

	


