class Solution {
    public int prefixCount(String[] words, String s) {
        int count =0;
        for(String word : words){
            if(word.startsWith(s)) count++;
        }
        return count;
    }
}