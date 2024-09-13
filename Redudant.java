public class Redudant {

    public static boolean reduntant(String s){
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);


            if(ch=='(' || ch=='+'|| ch=='-'|| ch=='*'|| ch=='/'){
                stack.push(ch);
            }
            else{
            //ch ya to ) orlowercase;
             if(ch==')'){
                boolean isreduantant = true;
                while (s.top()!='(') {
                    char top = stack.top();
                    if(top=='(' || top=='+'|| top=='-'|| top=='*'|| top=='/'){
                        isreduantant = false;
                }
                stack.pop()
             }

             if(isreduantant== true){
                return true;
                
             }

             
            }
            return false;
        }
    }
}
    public static void main(String[] args) {
        String expression="((a+b))";
        System.out.println("is reduantant:" reduntant(expression));

    }
}

