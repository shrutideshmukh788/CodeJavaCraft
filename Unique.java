public class Unique {
    public static int findunique(int a,int n) {
        int ans= 0;
        for (int i=0; i<n; i++){
            ans = ans^a(i);
        }

        for(int i=1; i<n; i++){
            ans = ans^i;
        }
        return ans;
    }
    
    private static int a(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'a'");
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,2}; 
        int  n = a.length;
        System.out.println(findunique(n, n)); 
    }
}
