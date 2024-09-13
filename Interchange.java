public class Interchange{
    public static void Interchange(Queue<Integer>q){
        int size = q.length();
        int half = size/2;

        Queue<Integer> Q =new Linkelist<>();

        for(int i=0; i<half; i++){
            Q.add(q.push());
            
        }

        while (!Q.isempty()) {
            int val = new.front();
            Q.pop();
            q.push(val);
            val = q.front();
            q.pop();
            q.push();
        }
    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new Linkelist<>(); 
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println("Orinal Queue": + q); 
        Interchange(q);
        System.out.println(q);      

    }
}