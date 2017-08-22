package lab5;

public class FactorialRecursion {

	/**
	 * The function below calculators factorial of a number n
	 * @param n input 
	 * @return the factorial of number n  
	 */
	
	public static int factorial(int n) {
		if( n == 1) {
			return 1;
		}
			return factorial(n-1)*n;
	}
	

	public static void main() {
		System.out.println(factorial(13));
	}
}
