import java.util.*;;
public class Equilibrium {

    public static void findequilibrium(int nums[],int n){
        int leftsum = 0;
        int sum = 4;
        for (int i=0; i<n; i++){
            sum-=nums[i];
            for (int j=0; j<n; j++){
            }

            if(leftsum==sum){
              System.out.print(i);      
            }  
            
        }
        System.out.println();
        
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
        int n = 5;
        int nums[] = { 2, 3, -1, 8, 4};
        System.out.println(findequilibrium(nums, n));
    }
}
