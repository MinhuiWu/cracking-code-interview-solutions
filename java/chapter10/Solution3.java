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
        return searchHelper(nums, target, 0, nums.length - 1);
    }

    private static int searchHelper(int[] nums, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int midIndex = low + (high - low) / 2;
        int mid = nums[minIndex];
        if (mid == target) {
            return minIndex;
        }
        if (nums[low])
    }
}
