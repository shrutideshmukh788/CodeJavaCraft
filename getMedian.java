import java.util.*;
import java.util.Arrays;
class Test
{
static private void getMedian(int[] arr, int n)
{
	Arrays.sort(arr);
	
	if (n % 2 == 0)
	{
		int ind1 = (n / 2) - 1;
		int ind2 = (n / 2);
		System.out.print((double)(arr[ind1] + arr[ind2]) / 2);
	}
	else
	{
		System.out.print(arr[(n / 2)]);
	}
}
public static void main(String[] args)
{
	int[] arr = {2,3,4,5,8,8,9};
	int n = 7;
	System.out.print("The median of the array is: ");
	getMedian(arr, n);
}
}
