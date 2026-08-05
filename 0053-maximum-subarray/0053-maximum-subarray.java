class Solution {
    public int maxSubArray(int[] nums) {
        int currentsum=nums[0],i,maxsum=nums[0];

    for(i=1;i<nums.length;i++){
        currentsum=Math.max(nums[i],currentsum+nums[i]);
        maxsum=Math.max(currentsum,maxsum);



     }
     return maxsum;
   
    }
}