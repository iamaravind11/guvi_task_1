package ExceptionAndCollections;

public class IntegerStack {
    private Stack<Integer> stack;

    public IntegerStack() {
        stack = new Stack<>();
    }

    // Method to push element onto the stack
    public void push(int element) {
        stack.push(element);
        System.out.println(element + " pushed onto the stack.");
    }

    // Method to pop element from the stack
    public int pop() {
        if (!stack.isEmpty()) {
            int poppedElement = stack.pop();
            System.out.println(poppedElement + " popped from the stack.");
            return poppedElement;
        } else {
            System.out.println("Stack is empty. Nothing to pop.");
            return -1; // or throw exception as needed
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Main method to demonstrate usage (optional)
    public static void main(String[] args) {
        IntegerStack intStack = new IntegerStack();

        intStack.push(10);
        intStack.push(20);
        intStack.push(30);

        System.out.println("Is stack empty? " + intStack.isEmpty());

        intStack.pop();
        intStack.pop();
        intStack.pop();

        System.out.println("Is stack empty? " + intStack.isEmpty());

        intStack.pop(); // Trying to pop from empty stack
    }
}
