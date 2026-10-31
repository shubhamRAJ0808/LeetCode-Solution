class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1 = new HashMap<>();
        for(String word : words1){
            map1.put(word,map1.getOrDefault(word,0)+1);
        }
        HashMap<String,Integer> map2 = new HashMap<>();
        for(String word : words2){
            map2.put(word,map2.getOrDefault(word,0)+1);
        }

        int count =0;
        for(int i=0;i<words1.length;i++){
            if(map1.containsKey(words1[i]) && map2.containsKey(words1[i])){
                if(map1.get(words1[i]) == 1 && map2.get(words1[i]) == 1){
                    count++;
                }
            }
        }
        return count;
    }
}