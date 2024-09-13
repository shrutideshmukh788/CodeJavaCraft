import java.util.*;
public class ST {
    int n;
    int top1 = -1;
    int top2 =n ;
    int maxsize=10;
    int[] arr = new int [maxsize];

    void push(int element){
        //Empty space
        if(top2-top1 > 1){
            top1++;
            arr[top1]= element;
        }
        else{
            System.out.println("Overflow");
        }
    }
    void push(int element){
        //Empty space
        if(top2-top1 > 1){
            top2--;
            arr[top2]= element;
        }
        else{
            System.out.println("Overflow");
        }
    }
    int pop(){
        if(top1>=0){
            System.out.println("Underflow");
            return -1;
        }
        else{
            int popitem = arr[top1];
            top1--;
            System.out.println("Item pop;");
            return popitem;
        }
    }
    int pop(){
        if(top2 < n){
            System.out.println("Underflow");
            return -1;
        }
        else{
            int popitem = arr[top2];
            top2++;
            System.out.println("Item pop;");
            return popitem;
        }
    }
    void display(){
        for(int i=top1; i>=0;i--){
           System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ST s = new ST();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(5);
        s.push(5);
        s.push(5);

        s.display();
        System.out.println("Item popped:"+s.pop());
        s.pop();
        s.display();
    }
       
}    