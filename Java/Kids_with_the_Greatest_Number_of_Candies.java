class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<Boolean>();
        int max=-1;
        for(int num:candies)
        {
            max = Math.max(num,max);
        }
        max-=extraCandies;
        for(int num:candies)
        {
            if(num>=max)
            {
                list.add(true);
            }
            else
                list.add(false);
        }
        return list;
    }
}