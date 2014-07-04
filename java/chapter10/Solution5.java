/**
 * Problem:
 * Given a sorted array of strings which is interspersed with empty strings, write
 * a method to find the location of a given string.
 */

public class Solution5 {
    /**
     * Solution:
     * While applying binary search, empty string will cause the algorithm hard to
     * decide which way to go. So every time we meet an empty string, we change the
     * index to its closest element until we find the non-empty string.
     *
     * Analysis:
     * Time Complexity: O(N), for the worst case the non-empty string lays on the left
     * most or right most.
     * Space Complexity: O(1), no additional space is required.
     */
    public static int binary_search(String[] sequence, String target) {
        if (sequence == null || sequence.length == 0) {
            return -1;
        }

        int low = 0;
        int high = sequence.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2; // avoid integer overflow

            // before searching, find a meaningful middle value
            if (sequence[mid].isEmpty()) {
                int left = mid - 1;
                int right = mid + 1;
                while (true) {
                    if (left < low && right > high) {
                        return -1;
                    } else if (left >= low && !sequence[left].isEmpty()) {
                        mid = left;
                        break;
                    } else if (right <= high && !sequence[right].isEmpty()) {
                        mid = right;
                        break;
                    }
                    left--;
                    right++;
                }
            }

            if (sequence[mid].equals(target)) {
                return mid;
            } else if (sequence[mid].compareTo(target) > 0) {
                low = mid - 1;
            } else {
                high = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String[] seq = {"a", "", "c", "", "b"};
        System.out.println(binary_search(seq, "a"));
    }
}
