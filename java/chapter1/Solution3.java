/**
 * Write a method to decide if two strings are anagrams or not.
 */

public class Solution3 {
	/**
	 * Solution:
	 * Anagrams mean same letters with different orders, so we can sort them
	 * then compare two sorted arrays, if they are anagrams, they should equal
	 * to each other.
	 *
	 * Analysis:
	 * Time Complexity: O(nlgn), where N means the length of string.
	 *                  Java.util.Arrays.sort() is nlogn.
	 * Space Complexity: O(N), where N means the length of string.
	 */
	public static boolean isPermutation1(String s, String t) {
		if (s == null || t == null) {
			throw new IllegalArgumentException();
		}

		if (s.length() != t.length()) { // Anagrams should have same length.
			return false;
		}

		return sort(s).equals(sort(t));
	}

	private static String sort(String str) {
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}

	/**
	 * Solution:
	 * We can also view anagrams as letters with same occurence times. So we can also
	 * calculate the frequency of each letters.
	 * We iterate through the first string and record the frequency then compare it 
	 * with the second one. For anagrams, they should have same frequency.
	 *
	 * Analysis:
	 * Time Complexity: O(N), where N means the length of the string.
	 * Space Complexity: O(N), we need an addtional dictionary to store the frequency.
	 */
	public static boolean isPermutation2(String s, String t) {
		if (s == null || t == null) {
			throw new IllegalArgumentException();
		}

		if (s.length() != t.length()) {
			return false;
		}

        java.util.Hashtable<Character, Integer> content = new java.util.Hashtable<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            content.put(key, !content.containsKey(key) ? 1 : content.get(key) + 1);

        }

        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            if (content.get(key) == 0) {
                return false;
            } else {
                content.put(key, content.get(key) - 1);
            }
        }

		return true;
	}

	public static void main(String[] args) {
		String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
		for (String[] pair : pairs) {
			String word1 = pair[0];
			String word2 = pair[1];
			boolean anagram = isPermutation1(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
			anagram = isPermutation2(word1, word2);
			System.out.println(word1 + ", " + word2 + ": " + anagram);
		}
	}
}