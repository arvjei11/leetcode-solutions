class Solution {
    public int[] runningSum(int[] nums) {
        int rSum=nums[0];
        for(int i = 1;i<nums.length;i++){
            rSum+=nums[i];
            nums[i] = rSum;            
        }
        
        return nums;
    }
}