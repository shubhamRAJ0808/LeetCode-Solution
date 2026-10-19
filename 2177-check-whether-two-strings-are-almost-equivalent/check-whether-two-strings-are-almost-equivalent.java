class Solution {
    public boolean checkAlmostEquivalent(String s, String t) {
        int[] freq1 = new int[26];
        for(char ch : s.toCharArray()){
            freq1[ch-'a']++;
        }
        int[] freq2 = new int[26];
        for(char ch : t.toCharArray()){
            freq2[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(Math.abs(freq1[i]-freq2[i])>3){
                return false;
            }
        }
        return true;

    }
}