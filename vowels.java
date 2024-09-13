
public class vowels {

    public static void Spaces(String str ,int n){
        str = str.toLowerCase();
        int vowels=0; 
        int consonate=0;
        int whitespaces=0;
        for (int i=0; i<=n; i++){
            char ch = str.charAt(i);
            if(ch =='a'|| ch =='e'|| ch =='i'||ch=='o'|| ch=='u'){
                vowels++;
            }
            else if(ch>='a' && ch<='z'){
                consonate++;
            }
            else if (ch==' ') {
                whitespaces++; 
            }

        }
        System.out.println("Vowels:" + vowels);
        System.out.println("Consonante:" + consonate);
        System.out.println("whitespaces:" + whitespaces);
    }

    public static void main(String[] args){
        String str = "Take u forward is Awesome";
        int n = str.length()-1;
        Spaces(str, n);

    }
}
