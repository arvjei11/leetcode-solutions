class Solution {
    public void duplicateZeros(int[] arr) {
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0){
                rightShift(arr,i+1);
                if(i!=arr.length-1)
                arr[i+1]=0;
                i++;
        }
        
            }
    }
    public int[] rightShift(int[] array,int index)
    {
        for(int j= array.length-1;j>index;j--)
        {
            array[j] = array[j-1];
        }
        return array;
    }
        }
        