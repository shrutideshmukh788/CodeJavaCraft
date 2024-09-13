public class Str {
    public static void main(String[] args) {
        String a = "noon";
        char[] b = a.toCharArray();
        String rev = " ";
        for(int i=a.length()-1; i>=0; i--) {
              rev = rev + b[i];
        } 
        System.out.println("Reverse is:"+ rev );
        if (a==rev){
            System.out.println("Palidrome");
        }
        else{
            System.out.println("Not Palidrome");
        }
    }
}
