import java.util.*;
public class java_maxofsubarrayk{
    public static void maxsubarray(int k, int arr[]){
        Deque<Integer> dq = new LinkedList<>();
        for(int i = 0;i<arr.length;i++){
            while(dq.size() > 1 && arr[i] >= dq.getLast()){
                dq.removeLast();
            }
            dq.addLast(i);
            if(i < i-k+1){
                dq.removeFirst();
            }
        }
        
    }
    public static void main(String[] args){
        int N= 9,k=3;
        int arr[] = {1,2,3,1,4,5,2,3,6};
        
        maxsubarray(k,arr);
        

        }
    }