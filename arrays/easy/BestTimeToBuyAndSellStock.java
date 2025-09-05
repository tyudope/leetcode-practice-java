package arrays.easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Best profit : " + maxProfit(prices));
    }
    public static int maxProfit(int[] prices){
        int cheapest = prices[0]; // lowest price seen so far.
        int bestProfit = 0; // best possible profit seen so far.
        for(int i = 1; i < prices.length; i++){
            if(cheapest > prices[i]){ // If the lowest price is greater than any element.
                                      // that means this is the new lowest price.
                cheapest = prices[i];
            }
            if ((prices[i] - cheapest) > bestProfit){ // update the max profit if better deal found.
                bestProfit = prices[i] - cheapest;

            }
        }
        return bestProfit;
    }

}
