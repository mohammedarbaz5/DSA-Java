import java.util.*;
public class java_binarynum{
    public static void main(String[] args) {
        int N = 5;
        ArrayList<String>  ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");
        
        for(int i = 0;i<N;i++){
            String top = q.poll();
            if(ans.size() < N){
                ans.add(top);
            }
            
            q.add(top + "0");
            q.add(top + "1");
        }
    
        System.out.print(ans);
            }
}