class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxRow= 0;
        for(int column=0;column<accounts[0].length;column++)
        {
            maxRow+=accounts[0][column];       
        }
        for(int row = 1;row < accounts.length;row++)
        {
            int total = 0;
            for(int column = 0;column<accounts[row].length;column++)
            {
                total+=accounts[row][column];
                if(total>maxRow)
                    maxRow = total;
            }
        }
        return maxRow;
        
    }
}