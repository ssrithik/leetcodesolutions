class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer,Integer> s = new HashMap<>();
        int i,j,t=0;
        for(i=0;i<mat.length;i++)
        { t=0;
            for(j=0;j<mat[0].length;j++)
            {
                t += mat[i][j];
            }
            s.put(i,t);
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(s.entrySet());
        list.sort(Map.Entry.comparingByValue());
        int arr[] = new int[k];
        for( i=0;i<k;i++)
        {
            arr[i] = list.get(i).getKey();
        }
         return arr;
    }
}