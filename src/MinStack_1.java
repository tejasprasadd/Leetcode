import java.util.Stack;


// Brute Force solution
class MinStack {
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int value) {
        stack.push(value);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        Stack<Integer> temp = new Stack<>();
        int mini = stack.peek();

        while (!stack.isEmpty()) {
            mini = Math.min(mini, stack.peek());
            temp.push(stack.pop());
        }
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        return mini;
    }

    public static void main(String[] args) {
        MinStack object = new MinStack();

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