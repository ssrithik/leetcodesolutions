class Solution {
    public int[] runningSum(int[] nums) {
      int[] arr = new int[nums.length];
      arr[0] = nums[0];
      int index=0;
      int i=0;
      for(i=1;i<nums.length;i++)
      {
         while(index <=i)
         {
            arr[i] += nums[index];
            index++;
         }
         index=0;
      }
      return arr;
    }
}