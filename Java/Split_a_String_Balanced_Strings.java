class Solution {
    public int balancedStringSplit(String s) {
        char[] arr = s.toCharArray();
        int balance = 0;
        int max =0;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] == 'L')
                balance++;
            if(arr[i]=='R')
                balance--;
            if(balance==0)
                max++;     
        }
        return max;
        
    }
}