import java.util.*;
public class Sum {
    
    public static String Sums(String input) {
        StringBuilder s= new StringBuilder(); 
        for (int i=0; i<=input.length()-1; i++){
            char ch = input.charAt(i); 
            if (!(ch >='a' && ch <= 'z'))
            {
                s.append(ch);
            }
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String input = "123xyz";
        System.out.println(" Strings: "+ Sums(input));
    }
}