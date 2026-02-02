import java.util.*;
public class java_lastStoneweight{
    public static int laststoneweight(int stones[]){
        PriorityQueue<Integer> mpq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i<stones.length;i++){
            mpq.add(stones[i]);
        }
        while(mpq.size()>1){
            int topelement = mpq.poll();
            int secondtopelement = mpq.poll();
            int finalStone = topelement - secondtopelement;
            if(finalStone > 0){
                mpq.add(finalStone);
            }
        }
        if(mpq.size() > 0){
            return mpq.peek();
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int stones[] = {4,3,2,6,6,2,8,5};
        int stones1[] = {4,3,2,6};
        int stones2[] = {2,7,4,1,8,1};
        System.out.println(laststoneweight(stones));
        System.out.println(laststoneweight(stones1));
        System.out.println(laststoneweight(stones2));


    }
}