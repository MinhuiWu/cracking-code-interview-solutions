import java.util.*;

/**
 * Problem
 * Implement SetOfStack data structure
 */

class SetOfStack{
    private ArrayList<LinkedList<Integer>> sets
        = new ArrayList<LinkedList<Integer>>();
    private int index;
    private int capacity;

    public SetOfStack(int capacity) {
        this.capacity = capacity;
    }

    public void push(int item) {
        LinkedList<Integer> stack = getStack();

        if (stack.size() == capacity) {
            LinkedList<Integer> newStack = new LinkedList<Integer>();
            newStack.addLast(item);
            sets.add(newStack);
            index++;
        } else {
            stack.addLast(item);
        }
    }

    public int pop() {
        LinkedList<Integer> stack = getStack();
        if (stack.isEmpty()) {
            throw new IllegalStateException();
        }
        return stack.removeLast();
    }

    /**
     * popAt method
     */
    public int popAt(int index) {
        LinkedList<Integer> stack = sets.get(index);
        return stack.removeLast();
    }

    private LinkedList<Integer> getStack() {
        return sets.get(index);
    }
}
