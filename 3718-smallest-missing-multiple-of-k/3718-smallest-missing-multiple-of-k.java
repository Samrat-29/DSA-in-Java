import java.util.*;
class Solution {
    public int missingMultiple(int[] nums, int k) {
       Arrays.sort(nums);
       int ans=k;
    for(int i=0;i<nums.length;i++){
        if(ans==nums[i]){
            ans+=k;
        }
    }
    return ans;
    }
}