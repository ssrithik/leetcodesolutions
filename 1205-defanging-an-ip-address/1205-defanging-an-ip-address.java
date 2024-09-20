class Solution {
    public String defangIPaddr(String address) {
        String m = address.replace(".","[.]");
        return m;
    }
}