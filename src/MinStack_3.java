import java.util.Stack;


// Single Stack solution
public class MinStack_3 {
    long min;
    Stack<Long> stack;

    public MinStack_3() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(0L);
            min = val;
        } else {
            stack.push(val - min);
            if (val < min) min = val;
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;

        long pop = stack.pop();

        if (pop < 0) min = min - pop;
    }

    public int top() {
        long top = stack.peek();
        if (top > 0) {
            return (int) (top + min);
        } else {
            return (int) min;
        }
    }

    public int getMin() {
        return (int) min;
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