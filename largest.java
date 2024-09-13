public class largest {
    public static String largestwordfing(String input) {
        
    String[] a = input.split("\\s+");

    String largestword ="" ; 
    int maxlenth =0;

    for(String words: a){
        int length = words.length();
     
        if(length>maxlenth){
            length= maxlenth;
            largestword = words;

        }

    }
    return largestword;

}
    public static void main (String args[]){
        String input = "This is a simple example to find the largest word";
        System.out.println("The largest word in the string is: " + largestwordfing(input));
    }
}
