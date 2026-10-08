class Solution {
    public String defangIPaddr(String s) {
        s = s.replace(".","[.]");
        return s;
    }
}