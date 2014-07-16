/**
 * Replace whitespace with %20 in a string.
 */
public class Solution4 {

	/**
	 * Solution: Use string built-in method - replaceAll
	 * Time Complexity: O(N), where N means the length of string
	 */
	public static String replaceSpaces(String str) {
		return str == null ? str : str.replaceAll(" ", "%20");
	}

	/**
	 * Solution:
	 * Iterate through the string, once we encounter a white space, replace it
	 * with %20 and store it in a StringBuilder.
     *
	 * Analysis:
	 * Time Complexity: O(N), where N means the length of the string
	 * Space Complexity: O(N), we need a extra buffer to store the new one.
	 */
	public static String replaceSpaces2(String str) {
		if (str == null) return null;
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) 
			c == ' ' ? sb.append("%20") : sb.append(c);
		return sb.toString();
	}

	public static String replaceSpaces3(String str) {
		if (str == null) return null;

		int cnt = 0;
		int oldLength = str.length();
		for (int i = 0; i < oldLength; i++) {
			if (str.charAt(i) == ' ') cnt++;
		}
		int newLength = oldLength + cnt * 2;
		char[] result = new char[newLength];

		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				result[index++] = '%';
				result[index++] = '2';
				result[index++] = '0';
			} else {
				result[index++] = str.charAt(i);
			}
		}

		return new String(result);
	}

	public static void main(String[] args) {
		String str = "abc d e f ";
		System.out.println(replaceSpaces(str));
		System.out.println(replaceSpaces2(str));
		System.out.println(replaceSpaces3(str));		
	}
}
