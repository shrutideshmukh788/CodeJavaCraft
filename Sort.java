public class Sort {

    public static  String Findsorting(String str,int n) {
       
        for(int i=0; i<n-1; i++){
            char a[] = str.toCharArray();
            for(int j=0; j<n-i-1; j++){

                if(a[i]> a[j]){
                    char temp = a[j];
                    a[j+1] = a[j];
                    a[j+1] = temp;
                }           
            }
        }
        String ans = new String();
        return ans;
        
    }
    public static void main(String[] args) {
        String str = "zxcbg";
        int n = str.length();

        System.out.println("before string:");
        System.out.println(str);
        System.out.println("after string:");
        System.out.println(Findsorting(str, n));
    }
}
