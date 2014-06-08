import java.util.*;

public class Solution1 {

	/**
	 * Assumption:
	 * We assume that input string is encoded in ascii, which means
	 * the max length of a unique string is 256.
	 *
	 * Solution: 
	 * Iterate down the string and store each of them in the boolean array.
	 * Once we found any of them has been stored, it means this is a duplicate.
	 *
	 * Analysis:
	 * Time Complexity: O(N), where N means the length of the string.
	 * Space Complexity: O(N), we need additional space to store boolean array.
	 */
	public static boolean isUnique1(String str) {
		if (str == null) { // empty string is unique.
			return true;
		}

		if (str.length() > 256) {
			throw new IllegalArgumentException();
		}

		boolean[] content = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (content[val]) {
				return false;
			}
			content[val] = true;
		}

		return true;
	}

	public static boolean isUnique2(String str) {
		if (str == null) {
			return true;
		}

		if (str.length() > 256) {
			throw new IllegalArgumentException();
		}

		int mask = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'A';
			if ((mask & (1 << val)) > 0) {
				return false;
			}
			mask |= 1 << val;
		}

		return true;
	}

	/**
	 * Assumption:
	 * We assume that we are using unicode string.
	 * 
	 * 
	 */
	public static boolean isUnique3(String str) {
		if (str == null) {
			return true;
		}

		Hashtable<Character, Boolean> content = new Hashtable<Character, Boolean>();
		for (int i = 0; i < str.length(); i++) {
			if (content.containsKey(str.charAt(i))) {
				return false;
			}
			content.put(str.charAt(i), true);
		}

		return true;
	}

	public static void main(String[] args) {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for (String word : words) {
			System.out.println(word + ": " + isUnique1(word) + " " 
				+ isUnique2(word) + " " 
				+ isUnique3(word));
		}
	}
}