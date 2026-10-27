/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int value) pushes the element value onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.
 * MinStack
 */
import java.util.Stack;
class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
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
          int removed = stack.pop();

        if (removed == minStack.peek()) {
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
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println("minStack.getMin() "+minStack.getMin()); // return -3
        minStack.pop();
        System.out.println("minStack.top() "+minStack.top());    // return 0
        System.out.println("minStack.getMin() "+minStack.getMin()); // return -2
        
    }
}

