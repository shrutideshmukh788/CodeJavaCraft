import java.util.Stack;

public class Stack1 {
    public static void pushStack(Stack<Integer> s, int count, int size) {
        // Base case
        if (count == size / 2) {
            s.pop();
            return;
        }

        // Recursive call
        int num = s.peek();
        s.pop();
        pushStack(s, count + 1, size);
        s.push(num);
    }

    public static void main(String[] args) {
        int count = 0;
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        int size = s.size();
        pushStack(s, count, size);

        // Print the stack without modifying it
        while (!s.isEmpty()) {
            System.out.println("Stack is " + s.peek());
            s.pop();
        }
    }
}
