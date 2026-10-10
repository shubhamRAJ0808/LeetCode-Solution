class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        for(int i=0;i<word.length();i++){
            char th = word.charAt(i);
            if(th == ch){
                String rev = new StringBuilder(sb.substring(0,i+1)).reverse().toString();
                sb.replace(0,i+1,rev);
                return sb.toString();

            }
        }
        return word;
        
    }
}