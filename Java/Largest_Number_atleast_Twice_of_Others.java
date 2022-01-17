class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length==1)
            return 0;
        int maxIndex=0;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++)
        {
            max = Math.max(max,nums[i]);
            maxIndex = i;
            
        }
        
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==max)
            {
                maxIndex =i;
            }
            
        }

        for(int i = 0;i<nums.length;i++)
        {
            if(nums[i]<=max/2||i==maxIndex)
            {
                continue;
            }
            return -1;
        }
        return maxIndex;
    }
}