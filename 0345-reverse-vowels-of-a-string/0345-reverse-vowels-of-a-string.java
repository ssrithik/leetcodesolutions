class Solution {
    public String reverseVowels(String s) {
      int n = s.length();
      char[] arr = s.toCharArray();
      int i=0,j=n-1;
      ArrayList<Character> m = new ArrayList<>();
      m.add('A');
      m.add('E');
      m.add('I');
      m.add('O');
      m.add('U');
      m.add('a');
      m.add('e');
      m.add('i');
      m.add('o');
      m.add('u');
      while(i < j)
      {
        while(!m.contains(arr[i])&& i<j)
        i++;
        while(!m.contains(arr[j]) && i<j)
        j--;
        if(i < j)
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        

      }
      String str = new String(arr);
      return str;
    }
      
}