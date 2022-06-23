package Array_Example;

public class IntegerArray1 {

	public static void main(String[] args) {
		// integer array
		
		int[] rate = new int [5];
		System.out.println(rate[0]);
		for (int temp: rate) { System.out.println(temp);
		}
		rate[0]=10;
		rate[1]=20;
		rate[3]=40;
		System.out.println("this is " + rate[0] +" " +rate[1]);
		}

	}


