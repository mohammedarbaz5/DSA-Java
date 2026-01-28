import java.util.*;
public class java_reversek{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        int k = 5;
        for(int i = 10;i<=100;i+=10){
            q.add(i);
        }
        if(q.size() < k){
            return;
        }
        int size = q.size();
        Stack<Integer> s =new Stack<>();
        for(int i =0;i<k;i++){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        for(int i = 0;i<size -k;i++){
            q.add(q.poll());
            
        }
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
        
    }
}