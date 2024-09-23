class Solution {
    public String toHex(int num) {
        if(num == 0)
        {
            return  "0";
        }
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        while(num!=0)
        {
            int rem = num&15;
            sb.insert(0,hexChars[rem]);
            num >>>=4;
        }
        return sb.toString();
        
    }
}