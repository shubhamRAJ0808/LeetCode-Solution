class Solution {
    public int mostWordsFound(String[] s) {
        
        int maxCount = 0;
        for(int i=0;i<s.length;i++){
            String t = s[i];
            int count = 0;
            for(int j=0;j<t.length();j++){
                char ch = t.charAt(j);
                if(ch == ' '){
                    count++;
                }
            }
            count++;
            maxCount = Math.max(count,maxCount);

        }
        return maxCount;
    }
}