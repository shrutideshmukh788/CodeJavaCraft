import java.util.Stack;

public class Valid {
        public static insertAtBottom(int s,int element) {
                //base case
                if(s.isEmpty()){
                        s.push(element);
                }
                int num = s.peek();
                s.pop();

                insertAtBottom(s,element);
                s.push(num);

        }

        public static reversestack(int s) {
                //base case 
                if(s.isEmpty){
                        return;
                }

                int num = s.peek();
                s.pop();

                //recursion call
                reversestack(s);
                
                insertAtBottom(s,num);
        }
        public static void main(String[] args) {
               Stack <Integer>s = new Stack<>();
               s.push(3); 
               s.push(4);
               s.push(5);
               s.push(7);
               s.push(9);
               reversing(s);
               public class Valid {
                public static insertAtBottom(int s,int element) {
                        //base case
                        if(s.isEmpty()){
                                s.push(element);
                        }
                        int num = s.peek();
                        s.pop();
        
                        insertAtBottom(s,element);
                        s.push(num);
        
                }
        
                public static reversing(int s) {
                        //base case 
                        if(s.isEmpty){
                                return;
                        }
        
                        int num = s.peek();
                        s.pop();
        
                        //recursion call
                        reversestack(s);
                        
                        insertAtBottom(num);
                }
                public static void main(String[] args) {
                       Stack <Integer>s = new Stack<>();
                       s.push(3); 
                       s.push(4);
                       s.push(5);
                       s.push(7);
                       s.push(9);
                       reversing();
                       public class Valid {
                        public static insertAtBottom(int s,int element) {
                                //base case
                                if(s.isEmpty()){
                                        s.push(element);
                                }
                                int num = s.peek();
                                s.pop();
                
                                insertAtBottom(s,element);
                                s.push(num);
                
                        }
                
                        public static reversing(int s) {
                                //base case 
                                if(s.isEmpty){
                                        return;
                                }
                
                                int num = s.peek();
                                s.pop();
                
                                //recursion call
                                reversestack(s);
                                
                                insertAtBottom(num);
                        }
                        public static void main(String[] args) {
                               Stack <Integer>s = new Stack<>();
                               s.push(3); 
                               s.push(4);
                               s.push(5);
                               s.push(7);
                               s.push(9);
                               reversing();
                               
                        }
                }
                while (!s.isEmpty()) {
                        System.out.print(s.pop() + " ");
                    }
                       
                }
        }
               
        }
}