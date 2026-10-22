class Solution {
    public int countVowelSubstrings(String s) {
        int count =0;
        HashSet<Character> vowel = new HashSet<>();
        vowel.add('a');vowel.add('e');vowel.add('i');vowel.add('o');vowel.add('u');
        for(int i=0;i<s.length();i++){
            HashSet<Character> ans = new HashSet<>();
            for(int j=i; j<s.length();j++){
                char ch = s.charAt(j);
                // in case of consonent
                if(!vowel.contains(ch)){
                    break;
                }
                ans.add(ch);

                if(ans.size()==5) count++;
            }
        }  
        return count;
    }
}