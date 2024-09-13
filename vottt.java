import java.util.*;
public class vottt {
    public static void main (String args[]){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = s.nextLine();
        String replace = input.replaceAll("[^a-zA-Z]", "");

        System.out.println("INPUT: " + input);
        System.out.println("replace:" + replace);
    }
}