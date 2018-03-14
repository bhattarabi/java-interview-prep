import java.util.HashMap;

//check if a given string has all unique characters

public class StringUniqueChars {
	
	//brute force solution:
	//for each character in str, check every other character 
	//for possible duplicate
	public static boolean hasUniqueCharsBF(String str) {
		for (int i=0; i<str.length(); i++) {
			char currentChar = str.charAt(i);
			for (int j=i+1; j<str.length(); j++) {
				if (currentChar == str.charAt(j))
					return false;
			}
		}
		return true;
	}
	
	//solution using a hashMap
	//could also use a bit array in similar way to keep track 
	//would need to know if dealing with ASCII (128 bits) or 
	//extended ASCII(256 bits)
	public static boolean hasUniqueCharsHM(String str) {
		HashMap<Character, Boolean> charCount = 
				new HashMap<Character, Boolean>();
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if (charCount.containsKey(ch))
				return false;
			else
				charCount.put(ch, true);
		}
		return true;
	}	
}
