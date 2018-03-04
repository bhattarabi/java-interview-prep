//Write Java Code to compute the nth Fibonacci number

import java.util.HashMap;

public class Fibonacci {
	
	//store pre-calculated values here
	private HashMap<Integer, Integer> cache = 
			new HashMap();
	
	
	//first solution (without using the cache):
	//calculate nth fibo number iteratively
	public int getNthFibo(int n) {
		int 	n1 = 1,
				n2 = 1,
				n3 = 1;
		
		for (int i=2; i<n; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		return n3;
	}
	
	
	//second solution (without using the cache):
	//calculate nth fibo number recursively
	public int getNthFiboRec(int n) {
		if (n<=2)
			return 1;
		
		return getNthFiboRec(n-1) + getNthFiboRec(n-2);
	}
	
	
	//third solution (using the cache):
	//calculate nth fibo number recursively
	public int getCachedFibo(int n) {
		
		if (n<=2)
			return 1;
		
		if (cache.containsKey(n))
			return cache.get(n);
		
		int fibo = getCachedFibo(n-1) + getCachedFibo(n-2);
		cache.put(n, fibo);
		
		return fibo;
	}
}