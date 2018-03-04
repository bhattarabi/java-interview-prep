//check if a given number is prime

public class PrimeNumber {

	//first solution (brute force)
	//check divisibility by all integers 2...n-1 
	public static boolean isPrime(int n) {
		for (int i=1; i<n; i++) {
			if (n%i == 0)
				return false;
		}
		return true;
	}
}
