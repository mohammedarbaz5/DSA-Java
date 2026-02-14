import java.util.*;

public class java_Minnumofcoins{
    public static void MinNumberofcoins(Integer coins[],int amount){
        int countOfcoins = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<coins.length;i++){
            if(amount >= coins[i]){
                while(amount >= coins[i]){
                    countOfcoins++;
                    amount -= coins[i];
                    list.add(coins[i]);
                }
            }
        }
    System.out.println(countOfcoins);
    System.out.println(list);
    }
    public static void main(String[] args) {
        Integer coins[] = {2000,500,200,100,50,20,10,5,2,1};
        Arrays.sort(coins,Comparator.reverseOrder());
    
        int amount = 590; 
        MinNumberofcoins(coins,amount);

        int amount1 = 1595; 
        MinNumberofcoins(coins,amount1);
    }
}