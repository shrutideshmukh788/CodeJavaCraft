public class Count {
    public static int FINDWORD(String input,int n)  {
        
        String[] word = input.split("\\s+");

        for(int i=0; i<word.length; i++){
            if(word[i].length()==n){}
        }
        return -1;
    }

    public static void main(String[] args) {
        String input = "abcdefghij google microsoft";
        int n = input.length();
        System.out.println(FINDWORD(input, n));
    }
}
