import java.util.Arrays;

public class Anagram {

    public static String Anagrams(String str) {
         
       char c[] = str.toCharArray();
       Arrays.sort(c);
       return new String(c);
    }
     public static boolean Docmumet(String Str1,String Str2)
    {
        if (Str1.length() != Str2.length())
            return false;
 
    

      for(int i=0; i<=Str1.length()-1;){

        if(Str1.charAt(i) != Str2.charAt(i)){
            return true;
        }
       }
    return false;
}
    public static void main(String[] args) {
        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";
        System.out.println(Docmumet(Str1, Str2));
    }
}
