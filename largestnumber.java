import java.util.*;
public class largestnumber{
    public static void main(String args[]) {
 
    int arr1[] =  {2,5,1,3,0};
    System.out.println("The Largest element in the array is: "+findLargestElement(arr1));
 
    int arr2[] =  {8,10,5,7,9};
    System.out.println("The Largest element in the array is: "+findLargestElement(arr2));
  }

  public static int findLargestElement(int arr[]) {
    int max= arr[0];
    for (int i = 0; i < arr.length-1; i++) {
      if (arr[i] > max) {
        max= arr[i];
      }
    }
    return max;
  }
}