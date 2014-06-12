import java.util.Stack;

/**
 * Use two stacks to implement a queue.
 */

class MyQueue<T> {
    private Stack<T> inbox = new Stack<T>();
    private Stack<T> outbox = new Stack<T>();

    public void enqueue(T item) {
        inbox.push(item);
    }

    public T dequeue() {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }

        return outbox.pop();
    }
}
