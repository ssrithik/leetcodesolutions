// class Solution {
//     public String toHex(int num) {
//         // if(num == 0)
//         // {
//         //     return  "0";
//         // }
//         // char[] hexChars = "0123456789abcdef".toCharArray();
//         // StringBuilder sb = new StringBuilder();
//         // while(num!=0)
//         // {
//         //     int rem = num&15;
//         //     sb.insert(0,hexChars[rem]);
//         //     num >>>=4;
//         // }
//         // return sb.toString();
        
        
//     }
// }
class Solution {
    public String toHex(int num) {
        char[] hexas = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        
        if (num == 0) return "0";
        if (num > 0 && num <= 15) return Character.toString(hexas[num]);

        long n = num;  // handle negative values
        if (n < 0) n += (1L << 32);
        
        StringBuilder result = new StringBuilder();
        
        while (n > 0) {
            result.insert(0, hexas[(int)(n % 16)]);
            n /= 16;
        }
        
        return result.toString();
    }
}