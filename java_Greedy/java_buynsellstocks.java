public class java_buynsellstocks{
    public static int buynsellStocks(int prices[]){
        int maxProfit= 0;
        int buyprice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyprice < prices[i]){
                int profit = prices[i] - buyprice;
                maxProfit = Math.max(profit,maxProfit);
            }else{
                buyprice = prices[i];
            }
        }
            return maxProfit;
        }
    public static void main(String[] args) {
        int prices[] = {7,6,4,3,2,1};
        System.out.println(buynsellStocks(prices));
        int prices2[] = {7,1,5,3,6,4};
        System.out.println(buynsellStocks(prices2));
}
}