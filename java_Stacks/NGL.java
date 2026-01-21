import java.util.*;
public class NGL {
    public static void ngl(int arr[],int nextgreater[]){
        Stack<Integer> s = new Stack<>();
        nextgreater[0] = -1;
        s.push(0);
        for(int i = 1;i<arr.length;i++){
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
        ngl(arr,nextgreater);
        for(int i = 0 ;i<nextgreater.length;i++){
            System.out.print(nextgreater[i]+" ");
        }
        System.out.println();
    }
}

