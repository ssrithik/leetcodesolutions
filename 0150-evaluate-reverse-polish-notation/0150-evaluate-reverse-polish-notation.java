class Solution {
    public int evalRPN(String[] tokens) {
        int i;
        Stack<Integer> sta = new Stack<>();
        int result=0;
        for(i=0;i<tokens.length;i++)
        {
            String s = tokens[i];
            if(s.equals("*"))
            {
                int z = sta.pop();
                int y = sta.pop();
                result = y*z;
                sta.push(result);
            }
            else if(s.equals("/"))
            {
                int z = sta.pop();
                int y = sta.pop();
                result = y/z;
                sta.push(result);
                
            } 
            else if(s.equals("+"))
            {
                int z = sta.pop();
                int y = sta.pop();
                result = y+z;
                sta.push(result);
            }
            else if(s.equals("-"))
            {
                int z = sta.pop();
                int y = sta.pop();
                result = y-z;
                sta.push(result);
                
            }
            else
            {
                int m = Integer.parseInt(s);
                sta.push(m);
            }
        }
        int m = sta.pop();
        return m;
    }
}