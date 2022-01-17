class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int sum = 0;
        for(int i = 0 ; i< nums.length; i ++){
            sum += nums[i];
            if(nums[i] == 0)    // reset sum to zero when encounters zeros
                sum = 0;
            else                // keep update max
                max = Math.max(max, sum);
        }
        return max;
    }
}