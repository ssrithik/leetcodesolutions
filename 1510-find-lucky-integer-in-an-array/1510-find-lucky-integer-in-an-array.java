class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> s = new HashMap<>();
        int i,j;
        for(i=0;i<arr.length;i++)
        {
            s.put(arr[i],s.getOrDefault(arr[i],0)+1);
        }
        int max=-1;
        for(i=0;i<arr.length;i++)
        {
            if((s.get(arr[i])==arr[i])&& arr[i] > max )
            {
                max = arr[i];
            }
        }
        return max;
    }
}