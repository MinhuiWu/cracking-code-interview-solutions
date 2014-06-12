/**
 * Problem:
 * Use a single array to impelement three stacks.
 */

/**
 * Solution:
 * Split the array into three parts, each part from include left index
 * and exclude right index such as [0, 1/3), [1/3, 2/3), [2/3, length)
 * Each operation on the stack should also assign the stack number.
 */
class ArrayStack<T> {
    private T[] items;
    private int length;
    private int[] size = {0, 0, 0};

    public ArrayStack(int capacity) {
        if (capacity % 3 != 0) {
            throw new IllegalArgumentException();
        }
        items = (T []) new Object[capacity];
        length = capacity / 3;
    }

    public int size(int index) {
        validation(index);
        return size[index - 1];
    }

    public boolean isEmpty(int index) {
        validation(index);
        return size[index - 1] == 0;
    }

    public void push(int index, T item) {
        validation(index);

        if (size[index] == length) {
            throw new IllegalStateException("Cannot push to full stack.");
        }

        items[size[index]++] = item;
    }

    public T pop(int index) {
        validation(index);

        if (isEmpty(index)) {
            throw new IllegalStateException("Cannot peek from empty stack.");
        }

        T item = items[size[index] - 1];
        items[size[index] - 1] = null;
        size[index]--;

        return item;

    }

    public T peek(int index) {
        validation(index);

        if (isEmpty(index)) {
            throw new IllegalStateException("Cannot peek from empty stack.");
        }

        return items[size[index] - 1];
    }

    private void validation(int index) {
        if (index < 0 || index > 3) {
            throw new IllegalArgumentException("Invalid index");
        }
    }
}


public class Solution1 {
    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<Integer>(90);
        stack.push(0, 10);
        stack.push(1, 20);
        stack.push(2, 30);

        stack.push(1, 21);
        stack.push(0, 11);
        stack.push(0, 12);

        stack.pop(0);

        stack.push(2, 31);

        stack.push(0, 13);
        stack.push(1, 22);

        stack.push(2, 31);
        stack.push(2, 32);
        stack.push(2, 33);
        stack.push(2, 34);

        stack.pop(1);

    }
}
