import java.util.*;
public class java_ActivitySel{
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        // end time based sort
        int activities[][] = new int[start.length][3];
        for(int i =0;i<start.length;i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

            Arrays.sort(activities,Comparator.comparingInt(o -> o[2]));
            int maxAct = 0;
            ArrayList<Integer> list = new ArrayList<>();
            list.add(activities[0][0]);
            maxAct = 1;
            int lastEnd = activities[0][2];
            for(int i = 1; i < activities.length; i++){
                if(activities[i][1] >= lastEnd){
                    maxAct++;
                    list.add(activities[i][0]);
                    lastEnd = activities[i][1];
                    
                }
            }
            System.out.println("Max Activities: "+maxAct);
            System.out.print(list);
        }
    }
