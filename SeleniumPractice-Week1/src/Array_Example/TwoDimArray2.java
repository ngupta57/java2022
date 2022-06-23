package Array_Example;
public class TwoDimArray2 {
public static void main(String[] args) {
		// two dim example
		
		int[][] TwoDim = new int[3][2];
		int temp3 = 10;
		for (int i= 0; i<3; i++) {
			for(int j = 0; j<2;j++){
				TwoDim[i][j]=temp3;
				temp3 += 10;
			}
			}
			for (int i= 0;i<3;i++) {
				 for(int j=0;j<2;j++){
					System.out.print(TwoDim[i][j] +" ");
				}
				 System.out.println();
			}
			}
}
		
	