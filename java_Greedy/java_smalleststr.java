public class java_smalleststr{
    public static void main(String[] args){
        int k =42;
        int n= 5;
        int extra = k-n;
        String s= "";
        for(int i = n-1;i>=0;i--){
            if(extra>=25){
                s+='z';
                extra-=25;
            }else{
                s+=(char)('a'+extra);
                extra-=extra;
            }
        }
    }
}