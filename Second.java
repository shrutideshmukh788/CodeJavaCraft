import java.util.Arrays;

public class Second {
    public static int Secondlargest(int arr[],int n){
        
        Arrays.sort(arr);
        
        {
        System.out.println("Second Smallest:"+ arr[1]);
        System.out.println("Second Largest:" + arr[n-2]);
        }
        return -1;

    }
    
    public static void main(String[] args)
     {
        int arr[] ={1,2,4,7,7,5}; 
        int n = arr.length;
        Secondlargest(arr, n);
    }
}
