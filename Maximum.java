public class Maximum {

    public static String Maximumcharcter(String str)
    {
        String ans = "";
        for(int i=0; i<=str.length(); i++)
        {   
            for(int j=i+1; j<=str.length(); j++){

                if(str.charAt(i)==str.charAt(j)){
                    {
                        break;
                    }
            }
            if(i==j){
                ans += str.charAt(i);
            }
        }
    }
    return ans;
}
    public static void main(String[] args) {
        String str = "takeuforward";
        System.out.println(" Original string"+ Maximumcharcter(str));
    }
}
