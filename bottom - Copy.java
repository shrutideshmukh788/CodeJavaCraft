import java.util.*;

public class Bottom {
    
    // Method to insert an element at the bottom of the stack using recursion
    public static void insertAtBottom(Stack<Integer> s, int element) {
        if(s.isEmpty()){
            s.push(element);
            return;
        }

        int num = s.peek();
        s.pop();

        insertAtBottom(s, element);

        s.push(num);
    }
    
    // Method to reverse the elements of the stack
    public static void reverse(Stack<Integer> s) {
        if(!s.isEmpty()){
            int element = s.peek();
            s.pop();
            reverse(s);
            insertAtBottom(s, element);
        }
    }
    
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        
        System.out.println("Initial Stack: " + s);
        
        // Reverse the elements of the stack
        reverse(s);
        
        System.out.println("Stack after reversing: " + s);
    }
}
