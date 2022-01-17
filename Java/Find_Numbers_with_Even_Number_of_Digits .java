class Solution {
    public int findNumbers(int[] nums) {
        int n=0;
        for(int i=0;i<nums.length;i++){
            int digits =1;
            while((nums[i]/=10)!=0)
            {
            digits++;
            }
            if(digits%2==0)
                n++;
        }
        return n;
    }
}

            