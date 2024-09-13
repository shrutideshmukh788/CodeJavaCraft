import java.util.*;
public class ReverseString {
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input=s.nextLine();
        String rev = " " ;
        char a[] = input.toCharArray();
        for(int i=input.length()-1; i>=0; i--){
             
            rev= rev + a[i];
        }
        System.out.println(rev);
    }
}
