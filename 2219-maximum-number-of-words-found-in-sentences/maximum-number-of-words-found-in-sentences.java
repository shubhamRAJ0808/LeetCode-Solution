class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount =0;
        for(int i=0;i<sentences.length;i++){
            String[] word = sentences[i].split(" ");
            int count = word.length;
            if(count>maxCount){
                maxCount = count;
            }
        }
        return maxCount;
    }

}