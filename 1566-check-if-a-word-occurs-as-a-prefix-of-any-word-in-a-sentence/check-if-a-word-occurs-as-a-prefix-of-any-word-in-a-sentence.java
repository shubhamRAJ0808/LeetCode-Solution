class Solution {
    public int isPrefixOfWord(String sentence, String tar) {
        String[] words = sentence.split(" ");
        
        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(word.length() < tar.length()) continue;
            boolean flag = true;
            for(int j=0;j<tar.length();j++){
                char ch = tar.charAt(j);
                char th = word.charAt(j);
                if(ch != th){
                    flag = false;
                    break;
                }
            }
            if(flag) return i+1;
        }
        return -1;
    }
}