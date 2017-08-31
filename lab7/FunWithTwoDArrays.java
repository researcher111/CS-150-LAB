public class FunWithTwoDArrays {

	 
	
	
	
	
	
	/*
	 * Write your code here
	 */
	
	
	
	
	
	
	
	
	
	
	
	//The function print two demensional array
	//You can use it help with debugging
	
	public static void print2DArray(double[][] array) {
		for(int i = 0; i<array.length; i++) {
			try {
				for(int j = 0; j <array.length; j++ ) {
					System.out.print(array[i][j] + " ");
				}
			}catch(Exception e) {
				System.out.println("Your array is only One Demensional");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
	}
	
}
