public class frequency {
    public static void frequencyarray(int arr[],int n){
        int i;
        boolean visited[]= new boolean[n];

        for (i=0; i< n; i++)
            if (visited[i] == true){
                continue;
            }

        int count=1;
        for(int j=i+1; j<n; j++){
              if(arr[i]== arr[j]){
                visited[j] = true;
                count++;
            }
        }
        System.out.println(arr[i] + " " + count);
    }
    public static void main(String[] args){
        int arr[] = {10,5,10,15,10,5};
        int n = arr.length; 
        frequencyarray(arr, n); 
    }
}
