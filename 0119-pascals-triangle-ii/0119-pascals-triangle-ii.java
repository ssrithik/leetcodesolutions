class Solution {
    public List<Integer> getRow(int rowIndex) {
        int i;
        List<List<Integer>> m = new ArrayList<>();
        m.add(new ArrayList<>(Arrays.asList(1)));
        m.add(new ArrayList<>(Arrays.asList(1,1)));
        int z=1;
        for( i=2;i<=rowIndex;i++)
        {
             ArrayList<Integer> f = new ArrayList<>();
             f.add(1);
             for(int j=0;j<m.get(z).size()-1;j++)
             {
                int y = m.get(z).get(j) + m.get(z).get(j+1);
                f.add(y);
             }
             f.add(1);
             m.add(f);
             z++;
        }
        return m.get(rowIndex);
    }
}