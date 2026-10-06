class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z ]", " "); 
        String[] words = paragraph.split("\\s+"); 

        // yeh banned word ke liye
        HashSet<String> set = new HashSet<>();
        for(String bann : banned){
            set.add(bann);
        }
        HashMap<String, Integer> map = new HashMap<>();
        for(String ele : words){
            if(!set.contains(ele))
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int maxFreq = Integer.MIN_VALUE;
        String ans = "";
       
        
        for(Map.Entry<String, Integer> enter : map.entrySet()){
            if(enter.getValue()>maxFreq){
                maxFreq = enter.getValue();
                ans = enter.getKey();

            }
        }
        return ans;
    }
}