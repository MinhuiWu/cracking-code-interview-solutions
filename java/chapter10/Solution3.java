/**
 * Problem:
 * Given a sorted array of n integers that has been rotated an unknown number of times
 * write code to find an element in the array. You may assume that the array was originally
 * sorted in increasing order.
 */
public class Solution3 {
    /**
     * Solution:
     *
     */
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // avoid overflow

            if (target == nums[mid]) return mid;

            if (nums[left] <= nums[right]) { // left halve is sorted.
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] data = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(search(data, 3));
    }
}
