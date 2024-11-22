//  Company Tags :
// Infosys,Zoho,TCS,IBM,Accenture... etc
//T.c = O(n) &  S.c = O(1)

class Solution {
    public int maximumProfit(int prices[]) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int coin: prices){
            if(coin<min_price){
                min_price = coin;
             }
        
            int profit = coin - min_price;
          
            if(profit > max_profit){
                max_profit = profit;
            }
        }
      return max_profit;
    }
}
