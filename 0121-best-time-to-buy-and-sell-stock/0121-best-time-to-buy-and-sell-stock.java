class Solution {
    public int maxProfit(int[] prices) {
        int day1=Integer.MAX_VALUE;
        int day2=0;
        for(int i=0;i<prices.length;i++){

       day1=Math.min(day1,prices[i]);
       day2=Math.max(day2,prices[i]-day1);
    
        }
        return day2;
    }
}