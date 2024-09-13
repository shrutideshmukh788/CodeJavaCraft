import java.util.Scanner;

public class fequency {

    public static void main(String args[] )
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("Charcter:" + "" + "Frequency");
        int count=0;
        for (int i=0; i<=s.length()-1; i++){
            char ch = s.charAt(i);
            for(int j=i+1; j<=s.length(); j++){
                if (s.charAt(i) == s.charAt(j)) {
                    count++; 
                }
               
            System.out.println("string:" + ch + count);
        }
           
    }
    sc.close();
}
}
