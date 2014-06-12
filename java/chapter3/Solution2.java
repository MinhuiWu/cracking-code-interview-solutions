import java.util.LinkedList;


/**
 * Problem:
 * Design a stack with, in addtion to push and pop, also has a function min
 * which returns the minimum element? Push, pop and min should all operate
 * in O(1) time.
 */

/**
 * Solution:
 * Use a extra stack to maintain the minimums. To retrieve the current min value
 * just return the top value from the min stack. When perform a pop operation,
 * check whether the poped item is the minimum, if it is, pop it from the min
 * stack too.
 * To simplify the problem, we use a wrapper around java.util.LinkedList class
 *
 */
public class Solution2 {
    private LinkedList<Integer> stack = new LinkedList<Integer>();
    private LinkedList<Integer> minStack = new LinkedList<Integer>();

    public void push(int item) {
        stack.addLast(item);

        if (min() > item) {
            minStack.addLast(item);
        }
    }

    public int pop() {
        int value = stack.removeLast();

        if (min() == value) {
            minStack.removeLast();
        }

        return value;
    }

    public int min() {
        if (minStack.isEmpty()) {
            return Integer.MAX_VALUE;
        } else {
            return minStack.getLast();
        }
    }

    public static void main(String[] args) {
        Solution2 stack = new Solution2();
        for (int i = 0; i < 15; i++) {
            stack.push(i);
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Pop item " + stack.pop());
            System.out.println("New min is " + stack.min());
        }
    }
}
