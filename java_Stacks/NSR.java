import java.util.*;
public class NSR {
    public static void nsr(int arr[],int nextsmaller[]){
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1;i >= 0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextsmaller[i] = -1;
            }else{
                nextsmaller[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};
        int nextsmaller[] = new int[arr.length];
        nsr(arr,nextsmaller);
        for(int i = 0 ;i<nextsmaller.length;i++){
            System.out.print(nextsmaller[i]+" ");
        }
        System.out.println();
    }
}

