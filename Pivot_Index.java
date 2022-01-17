class Solution {
    public int pivotIndex(int[] nums) {
        int tSum=0;
        int lSum=0;
        for(int num:nums)
            tSum+=num;
        for(int i =0;i<nums.length;i++)
        {
            //totalSum - the leftSum will equal the right Sum
            if(lSum==tSum-lSum-nums[i])
                return i;
            lSum+=nums[i];
        }
        return -1;
        
    }
}