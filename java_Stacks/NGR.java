import java.util.*;
public class NGR {
    public static void ngr(int arr[],int nextgreater[]){
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgreater[i] = -1;
            }else{
                nextgreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        int nextgreater[] = new int[arr.length];
        ngr(arr,nextgreater);
        for(int i = 0 ;i<nextgreater.length;i++){
            System.out.print(nextgreater[i]+" ");
        }
        System.out.println();
    }
}
