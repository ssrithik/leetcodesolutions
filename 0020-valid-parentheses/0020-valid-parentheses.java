class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)== '{' || s.charAt(i)== '(' || s.charAt(i)=='[')
            {
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)== '}' || s.charAt(i)== ')' || s.charAt(i)==']')
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char ch = st.pop();
                if((ch=='{' && s.charAt(i)=='}') || (ch=='(' && s.charAt(i)==')') || (ch == '[' && s.charAt(i)==']'))
                {
                    continue;
                }
                else
                {
                    return false;
                }
            }
            
        }
        if(st.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}