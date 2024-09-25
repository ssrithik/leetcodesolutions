class Solution 
{
  public String addBinary(String a, String b) 
  {
   StringBuilder sb = new StringBuilder();
   int c = 0;
   int m = a.length()-1;
   int n = b.length()-1;
   while(m >= 0 || n>=0 || c ==1)
   {
    if(m>=0)
    c += a.charAt(m--) - '0';
    if(n>=0)
    c+=b.charAt(n--) - '0';
    sb.append(c%2);
    c/=2;
   }
   return sb.reverse().toString();
  }
}