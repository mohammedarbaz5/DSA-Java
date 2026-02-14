import java.util.*;
public class java_jobsequencing{
    static class Job{
        int id;
        int deadline;
        int profit;
        Job(int i,int d,int p){
            id = i;
            deadline =d;
            profit = p;
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][] = {
            {4,20},{1,10},{1,40},{1,30}
        };
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i = 0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(jobs,(obj1,obj2) -> obj2.profit - obj1.profit);
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        int Maxprofit = 0;
        for(int i =0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time){
                seq.add(curr.id);
                time++;
                Maxprofit += curr.profit;
            }
        }
        System.out.println(seq.size());
        System.out.println(seq);
        System.out.println(Maxprofit);
        }
    }