import java.util.*;
public class java_interleave2halves{
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        Queue<Integer> q1 = new LinkedList<>();
        int size = q.size();
        for(int i= 0;i<size/2;i++){
            q1.add(q.poll());
        }
        while(!q1.isEmpty()){
            q.add(q1.poll());
            q.add(q.poll());
        }

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}