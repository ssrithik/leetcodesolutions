class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int i,index1=0,index2=n,index3=0;
        for(i=0;i<arr.length;i++)
        {
            if(index1 < n)
            {
            arr[index3] = nums[index1];
            index1++;
            index3++;
            }
            if(index2 < arr.length)
            {
                arr[index3] = nums[index2];
                index2++;
                index3++;
            }
            
        }
        return arr;
    }
}