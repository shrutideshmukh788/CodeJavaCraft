import java.util.*;

public class S{

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println("Intial Stack:"+ s);
        System.out.println("pop element:"+ s.pop());
        s.pop();
        
        System.out.println("final stack:" +s);
        
        
    }
}