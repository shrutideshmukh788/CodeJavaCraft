import java.util.Scanner;

public class Input {
    public static String INTEGERVALUUE(String str1,String str2){ {
        StringBuilder sc = new StringBuilder();
        for (int i=0; i<str1.length(); i++){
            int count=0;
            for (int j=0; j<str1.length(); j++)
            {
                if( str1.charAt(i) == str2.charAt(j)){
                    count=1;
                }
            }
            if(count != 1){
               sc.append(str1.charAt(i));
            }
        }
    }
    return str2.toString();
}

public static void main(String args[])
{
    String str1 = "abcdef";
    String str2 = "cefz";
    System.out.println("Final string 1:");
    System.out.println(INTEGERVALUUE(str1, str2));
    }
}

