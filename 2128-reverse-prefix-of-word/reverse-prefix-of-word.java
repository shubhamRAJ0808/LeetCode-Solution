class Solution {
    public String reversePrefix(String word, char ch) {
        int d = word.indexOf(ch);
        if(d == -1) return word;
        StringBuilder sb = new StringBuilder(word);
        String rev = new StringBuilder(sb.substring(0,d+1)).reverse().toString();
        sb.replace(0,d+1,rev);
        return sb.toString();
        
    }
}