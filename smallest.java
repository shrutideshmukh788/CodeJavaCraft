public class smallest {
    
    public static int small(int number[])
    {
        int i;
        int S = Integer.MAX_VALUE; 

        for (i=0; i<number.length; i++)
            if(S > number[i])
            {
               S = number[i];
            }

        return S;
    }

    public static void main(String[] args) {
        
        int number1[] = {2,5,3,0};
        System.out.println("Smallest number is :" + small(number1));
    }
}
