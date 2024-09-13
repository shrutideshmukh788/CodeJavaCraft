import java.util.Scanner;
public class Change {
    public static void main(String args[] )
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        String result = " ";
        for(int i=0; i<=s.length(); i++){
            char ch = s.charAt(i);
            result =  result + (char)((((int)ch)+1));
            System.out.println("Resuit:" + result);
        } 
        
    
    }

}