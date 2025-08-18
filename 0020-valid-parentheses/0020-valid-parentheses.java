class Solution {
    public boolean isValid(String s) {
        Stack<Character> sta = new Stack<>();
        int i;
        for(i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                sta.push(ch);
            }
            else if(ch==')' || ch== ']' || ch=='}')
            {
                if(sta.isEmpty())
                {
                    return false;
                }
                char ch1 = sta.pop();
                if((ch==')' && ch1!='(') || (ch=='}' && ch1 != '{' ) ||( ch==']' && ch1!='['))
                {
                    return false;
                }
               
            }
        }
        if(!sta.isEmpty())
        {
            return false;
        }
        return true;
    }
}