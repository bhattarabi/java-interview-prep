//check if a given number is prime

public class PrimeNumber {

	//first solution (brute force)
	//check divisibility by all integers 2...n-1 
	public static boolean isPrime(int n) {
		if (n==1)
			return false;
		for (int i=2; i<n; i++) {
			if (n%i == 0)
				return false;
		}
		return true;
	}
	
	//second solution
	//only check divisiblity by integers 2...sqrt(n)
	public static boolean isPrimeSqrt(int n) {
		return isPrime((int)Math.sqrt(n) + 1);
	}
	
	//third solution (most optimal)
	public static boolean isPrimeMathematical(int n) {
		if (n==1)
			return false;
		if (n==2)
			return true;
		return (n*n - 1) % 24 == 0;
	}
}