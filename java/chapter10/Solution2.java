/**
 * Problem
 * Write a method to sort an array of strings so that all the anagrams are next to each other.
 */

import java.util.*;

public class Solution2 {
    /**
     * Solution:
     * To find a general sorted result, we just need to group them in the resulted
     * array. To do this, we use a HashMap to store a string-list pair.
     *
     * Analysis:
     * Time Complexity: O(N), where N means the length of the string array.
     * Space Complexity: O(N), a hash map is required to store the result.
     */
    public static void sortAnagram(String[] seq) {
        if (seq == null || seq.length <= 1) {
            return;
        }

        HashMap<String, LinkedList<String>> map = new HashMap<String, LinkedList<String>>();
        for (String str : seq) {
            String key = sort(str);
            if (!map.containsKey(key)) {
                map.put(key, new LinkedList<String>());
            }
            map.get(key).push(str);
        }

        int index = 0;
        for (String key : map.keySet()) {
            LinkedList<String> list = map.get(key);
            for (String str : list) {
                seq[index++] = str;
            }
        }
    }

    private static String sort(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static void main(String[] args) {
        String[] seq = {"acre", "abc", "race", "cba", "bac","care"};
        for (String s : seq) {
            System.out.print(s + " ");
        }
        System.out.println();

        sortAnagram(seq);
        for (String s : seq) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
