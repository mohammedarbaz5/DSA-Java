public class java_Kthlargestevennum {
    public static int largestEven(int R,int k,int L){
        int X;
        if(R %2== 0){
            X= R; 
        }else{
            X = R -1; 
        }
        int EvenNum = X - (k-1) *  2;
        if(EvenNum < L){
           return 0;
         }else{
            return EvenNum;
         }
    }
    public static void main(String[] args) {
        int L = -28;
        int R = 28;
        System.out.println(largestEven(R, 18, L));
    }
}