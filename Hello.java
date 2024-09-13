import java.util.Scanner;

public class Hello {
    public static  int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();
        int count=0;
        for (int i=0; i<=s.length(); i++)
        {
            for (int j=i+1; j<=s.length(); j++)
            {
                if( s.charAt(i) == s.charAt(j)){
                    count++;
                }
                if (s.charAt(i) != s.charAt(j)) {
                    System.out.println("");
                }
            }
        }
        return count;
    }
}