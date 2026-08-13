import java.util.Stack;


// Two Stack solution
class MinStack_2 {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack_2() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        int top = stack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }

    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack_3 object = new MinStack_3();

        // Test case
        object.push(-2);
        object.push(0);
        object.push(-3);

        System.out.println(object.getMin()); // Expected: -3

        object.pop();

        System.out.println(object.top());    // Expected: 0

        System.out.println(object.getMin()); // Expected: -2
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */