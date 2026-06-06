class Solution {
    public int singleNumber(int[] arr) {
     HashMap<Integer,Integer> hm = new HashMap<>();
     int i;
     for(i=0;i<arr.length;i++)
     {
        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
     }
     for(i=0;i<arr.length;i++)
     {
        if(hm.get(arr[i])==1)
        {
            return arr[i];
        }
     }
     return 0;
    }
}