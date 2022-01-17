class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet set = new HashSet<>();
        for(int number: nums)
        {
            if(set.contains(number))
                return true;
            set.add(number);
        }
        return false;            
    }
}