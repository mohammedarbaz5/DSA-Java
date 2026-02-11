import java.util.*;
 public class java_jobsequencing{
    static class Job{
        int id;
        int deadline;
        int profit;
        Job(int id,int deadline,int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {
            {4,20},{1,10},{1,40},{1,30}
        };
        PriorityQueue<Job> mpq = new PriorityQueue<>((obj1,obj2) -> obj2.profit - obj1.profit);
            for(int i = 0;i < jobsInfo.length;i++){
                Job job = new Job(i,jobsInfo[i][0],jobsInfo[i][1]);
                mpq.add(job);
            }
            ArrayList<Integer> list = new ArrayList<>();
            int time = 0;
            while(!mpq.isEmpty()){
                Job curr = mpq.poll();
                if(curr.deadline > time){
                    time++;
                    list.add(curr.id);
                }
            }
            System.out.print(list);
            }

    }