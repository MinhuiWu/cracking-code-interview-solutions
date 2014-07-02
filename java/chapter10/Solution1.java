/**
 * Problem:
 * You are given two sorted array, A and B, where A has a large enough buffer
 * at the end to hold B. Write a method to merge B into A in sorted order.
 */

public class Solution1 {
    /**
     * Assumption:
     * We assume that sorted arrays A and B are both in ascending order. And the
     * result should also be in ascending order.
     * We assume the input parameters also contains the meaningful length of A
     * and B.
     *
     * Solution:
     * As A has enough buffer, we actually insert the B into A. Iterate through
     * two arrays and compare them, if necessary, insert element in B into A.
     *
     * Analysis:
     * Time Complexity: O(M), where M means the length of A.
     * Space Complexity: O(1), no additional space is required.
     */
    public static void mergeArrays(int[] A, int m, int[] B, int n) {
        if (A == null || A.length < m) {
            throw new IllegalArgumentException();
        }

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (k >= 0) {
            if (j < 0 || (i >= 0 && A[i] > B[j])) {
                A[k--] = A[i--];
            } else {
                A[k--] = B[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] A = {1, 3, 5, 0, 0, 0, 0};
        int[] B = {2, 4, 6};
        mergeArrays(A, 3, B, 3);
        for (int a : A) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
