class Solution {
    public int maximum69Number (int num) {
        int sixIndex=-1;
        int temp = num;
        for(int i = 0;temp>0;i++)
        {
            if(temp%10==6)
                sixIndex = i;
            temp/=10;
        }
        return num+3*(int)Math.pow(10,sixIndex);
    }
}