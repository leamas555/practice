/**
 * 
 * @author seanders
 *
 * Simply print the longest sub-string of the given string that contains, at most, 
 * two unique characters. If you find multiple sub-strings that match the 
 * description, print the last sub-string (furthest to the right).
 */


public class LongestTwoCharacters {

	
	public static String subString(String str) {
		String firstChar = str.substring(0,1);
		String secondChar = str.substring(1,2);
		String longestCurrent = firstChar + secondChar;
		String longestArchive = "";
		
		for(int i=2; i<str.length(); i++) {
			String substring = str.substring(i,i+1);
			
			if (longestCurrent.contains(substring)) {
				longestCurrent = longestCurrent + substring;
			} else {
				if (longestCurrent.length() >= longestArchive.length())
				  longestArchive = longestCurrent;
				longestCurrent = longestCurrent.substring(longestCurrent.length() - 1 ) + substring;
			}
			
		}
		
		
		if (longestCurrent.length() >= longestArchive.length())
			return longestCurrent;
		else
			return longestArchive;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String str  = "abbccc";   // bbccc
		String str2 = "abcaaabcabcabccc"; // bccc
		String str3 = "qwertyytrewq"; // tyyt
		
		
		
		
		System.out.println(subString(str2));
		
	}

}
