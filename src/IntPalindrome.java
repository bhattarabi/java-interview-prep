public class IntPalindrome {
	
	//Reverse the number then compare the reverse with the
	//original. doesn't work when n contains leading 0s
	public static boolean isPalindromeIter(int n) {
		int reverse = 0, n_copy = n;
		
		while (n_copy>0) {
			reverse = reverse*10 + n_copy%10;
			n_copy /= 10;
		}
		
		return reverse == n;
	}
	
	//another solution: convert the int to a string then use
	//any of the isPalindrome methods from the StringPalindrome class
	public static boolean isPalindromeAsStr(int n) {
		return StringPalindrome.isPalindromeIterIndex(String.valueOf(n));
	}
}