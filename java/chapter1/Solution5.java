/**
 * Compress data
 */
public class Solution5 {

	/**
	 * Solution: 
	 * 1. Insert the picked character from source into the destination string
	 * 2. Count the number of subsequent occurences and append it to the destination.
	 * 3. Pick the next character and repeat.
	 * 
	 * Analysis:
	 * Time Complexity: O(N)
	 * Space Complexity: O(N), for worst case we need 2N spaces to store all different chars.
	 */
	public static String compress(String str) {
		if (str == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i));
	
			int length = 1;
			while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				length++;
				i++;
			}
			sb.append(length);
		}

		return sb.toString();

	}

	public static void main(String[] args){
		String str = "abcde";
		System.out.println(compress(str));

	}
}