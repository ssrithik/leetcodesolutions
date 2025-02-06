class Solution {
    public boolean wordPattern(String pattern, String s) {
        int i,j;
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length)
        return false;
        HashMap<Character,String> t = new HashMap<>();
        for(i=0;i<arr.length;i++)
        {
           
                if(!t.containsKey(pattern.charAt(i)))
                {
                if(!t.containsValue(arr[i]))
                {
                    t.put(pattern.charAt(i),arr[i]);
                }
                else
                {
                    return false;
                }
                }
                else if(arr[i].compareTo(t.get(pattern.charAt(i)))!=0)
                {
                    return false;
                }
            
        }
        return true;
        
    }
}