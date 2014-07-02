import java.util.ArrayList;

/**
 * Problem:
 * A child is running up a stairecase with n steps, and can hop either 1 step,
 * 2 steps, or 3 steps at a time. Implement a method to count how many possible
 * ways the child can run up the stairs.
 */
public class Solution1 {
    /**
     * Solution:
     * Each n state is determined by (n - 1), (n - 2), (n - 3). This is the repeated
     * pattern in Recursion. For base case, we can easily find that if n is smaller
     * than 0, there's no possible way, or n equals to 1, there's just one way.
     *
     * Analysis:
     * Time Complexity:
     * Space Complexity:
     */
    public static int runStairs(int n) {
        if (n < 0) return 0;
        return n == 0 ? 1 : runStairs(n - 1) + runStairs(n - 2) + runStairs(n - 3);
    }

    /**
     * Solution:
     * To avoid recalculation problem, we can also use top-down dynamic programming
     * which means recursion with memorization (a.k.a cache).
     */
    public static int runStairsDP(int n) {
        int[] cache = new int[500];
        return runStairsDPHelper(n, cache);
    }

    private static int runStairsDPHelper(int n, int[] cache) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (cache[n] > 0) {
            return cache[n];
        } else {
            cache[n] =  runStairsDPHelper(n - 1, cache)
                + runStairsDPHelper(n - 2, cache)
                + runStairsDPHelper(n - 3, cache);
            return cache[n];
        }
    }

    /**
     * Solution:
     * Bottom-up approach in Dynamic programming.
     */
    public static int runStairsTabulation(int n) {
        if (n < 0) return 0;

        int[] table = new int[n + 1];
        table[0] = 1;
        table[1] = 1;
        table[2] = 2;
        table[3] = 4;
        for (int i = 4; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2] + table[i - 3];
        }
        return table[n];
    }

    public static void main(String[] args) {
        System.out.println(runStairs(3));
        System.out.println(runStairsDP(3));
        System.out.println(runStairsTabulation(3));
    }
}
