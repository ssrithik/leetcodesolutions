class Solution {
    public void floydwarshall(int[][] dist,int n)
    {
        int i,j,k;
        for(k=0;k<n;++k)
        {
            for(i=0;i<n;++i)
            {
                for(j=0;j<n;++j)
                {
                    dist[i][j] = Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                }
            }
        }
    }
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist = new int[n][n];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(dist[i],(int)10e4 + 1);
        }
        for(int[] edge : edges)
        {
            int src = edge[0];
            int dst = edge[1];
            int wt  = edge[2];
            dist[src][dst] = wt;
            dist[dst][src] = wt;
        }
        floydwarshall(dist,n);
        int result = -1;
        int mincity = Integer.MAX_VALUE;
        for(int i=0;i<n;++i)
        {
            int count=0;
            for(int j=0;j<n;++j)
            {
                if(i!=j && dist[i][j] <= distanceThreshold) count++;
            }
            if(count <= mincity)
            {
                mincity = count;
                result = i;
            }
        }
        return result;
    }
}