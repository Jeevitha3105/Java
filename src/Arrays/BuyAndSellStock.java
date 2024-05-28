package Arrays;

public class BuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            else{
                int profit = prices[i] - min;
                if(profit > max){
                    max = profit;
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] prices = {7,6,4,3,1,10};
        System.out.println(maxProfit(prices));
    }

}
