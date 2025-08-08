class Solution {
    public int maxProfit(int[] prices) {
        int mn=prices[0];
        int mx=0;
        for(int i=0;i<prices.length;i++){
            if(mn>prices[i]){
                mn=prices[i];
            }
            else if(mx<(prices[i]-mn)){
                mx=prices[i]-mn;
            }
        }
        return mx;
        
    }
}