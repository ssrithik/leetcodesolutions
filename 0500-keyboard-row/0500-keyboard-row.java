class Solution {
     public static boolean containsAllCharacters(String str1, String str2) {
        if(str1.equals(str2))
        return true;
        for (int i = 0; i < str2.length(); i++) {
            if ((str1.indexOf(Character.toLowerCase(str2.charAt(i))) == -1)) {
                return false;  
            }
        }
        return true;  
    }
    public String[] findWords(String[] words) {
        String k = "qwertyuiop";
        String e = "asdfghjkl";
        String y = "zxcvbnm";
        List<String> m = new ArrayList<>();
        for(String word:words)
        {
                if(containsAllCharacters(k,word)==true)
                {
                    m.add(word);
                }
                else if(containsAllCharacters(e,word)==true)
                {
                    m.add(word);
                }
                else if(containsAllCharacters(y,word)==true)
                {
                    m.add(word);
                }
        }
        System.out.println(m);
        String[] s = new String[m.size()];
        for(int i=0;i<m.size();i++)
        {
            s[i] = m.get(i);
        }
        return s;
    }
}