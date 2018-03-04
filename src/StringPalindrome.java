public class StringPalindrome {
	
	//Iterative solution that uses StringBuilder
	//can also be used to return the reverse of the string 
	public static boolean isPalindromeIter(String test) {
		StringBuilder sb = new StringBuilder();
		
		for (int i=test.length()-1; i>=0; i--) {
			sb.append(test.charAt(i));
		}
		
		return test.equalsIgnoreCase(sb.toString());
	}
	
	//Iterative solution that uses indexes instead of stringBuilder
	public static boolean isPalindromeIterIndex(String test) {
		
		int begin = 0, end = test.length()-1;		
		
		while (begin<end) {
			if (test.charAt(begin) != test.charAt(end))
				return false;
			
			begin++;
			end--;			
		}
		return true;
	}
	
	//helper function for the recursive solution
	private static boolean palindromeRec(String test, 
			int p, int q) {
		if (q<=p)
			return true;
		if (test.charAt(p) != test.charAt(q))
			return false;
		return palindromeRec(test, p+1, q-1);
	}
	
	
	//Recursive solution
	//this method simply calls the palindromeRec method 
	//where the recursion happens
	public static boolean isPalindromeRec(String test) {
		return palindromeRec(test, 0, test.length()-1);
	}
}
