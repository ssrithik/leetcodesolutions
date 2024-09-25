class Solution {
    public boolean canConstruct(String r, String m) {
       char[] f = m.toCharArray();
       ArrayList<Character> s = new ArrayList<>();
       int i;
       for(i=0;i<f.length;i++)
       {
        s.add(f[i]);
       }
       for(i=0;i<r.length();i++)
       {
        if(!s.contains(r.charAt(i)))
        {
            return false;
        }
        else
        {
            s.remove((Character) r.charAt(i));
        }
       }
       return true;
    }
}