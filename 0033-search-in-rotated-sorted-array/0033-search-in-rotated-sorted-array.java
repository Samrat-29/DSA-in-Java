class Solution {
    public int search(int[] nums, int target) {
        int result=0,i;
         for(i=0;i<nums.length;i++){
             if(nums[i]==target){
                result=i;
                 return result;
             }
     
           
        
         }

     return -1; }
}