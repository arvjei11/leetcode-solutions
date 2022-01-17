class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> map = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        int count=0;
        for(int i = 0; i< nums1.length;i++)
        {
            map.add(nums1[i]);
        }
        for(int i =0;i<nums2.length;i++)
        {
            if(map.contains(nums2[i]))
            {
                res.add(nums2[i]);
                map.remove(nums2[i]);
            }
        }
        int size = res.size();
        int[] result = new int[size];
        int iterator=0;
        for(int num: res)
        {
            result[iterator]=num;
            iterator++;
        }
        return result;
    }
}