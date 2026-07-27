class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int i;
         int[] ans=new int[nums.length*2];
        for(i=0;i<nums.length;i++){
            ans[i]=nums[i];
            
        }
        for(i=0;i<nums.length;i++){
            ans[nums.length+i]=nums[i];
            
        }
        return ans;
    }
}