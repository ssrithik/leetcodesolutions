class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> s = new HashMap<>();
        int i;
        for(i=0;i<arr.length;i++)
        {
            s.put(arr[i],s.getOrDefault(arr[i],0)+1);
        }
        int max=0;
        for(i=0;i<arr.length;i++)
        {
            if(s.get(arr[i]) == arr[i])
            {
                if(arr[i] > max)
                {
                    max = arr[i];
                }
            }
        }
        if(max==0)
        return -1;
        return max;
        
    }
}