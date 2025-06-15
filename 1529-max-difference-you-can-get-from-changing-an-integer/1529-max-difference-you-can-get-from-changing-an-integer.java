class Solution {
    public int maxDiff(int num) {
        String numstr = String.valueOf(num);
        HashSet<Character> uniqueDigits = new HashSet<>();
        for(char ch: numstr.toCharArray())
        {
            uniqueDigits.add(ch);
        }
        int maxval = num;
        int minval = num;
        for(char digit : uniqueDigits)
        {
            for(char newDigit = '0';newDigit<= '9';newDigit++)
            {
                if(numstr.charAt(0)== digit && newDigit == '0') continue;
                String newNumStr = numstr.replace(digit,newDigit);
                int newNum = Integer.parseInt(newNumStr);
                maxval = Math.max(maxval,newNum);
                minval = Math.min(minval,newNum);
            }
        }
        return maxval - minval;
    }
}