class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean same = true;
        int freq = -1; 
        for(int value : map.values()){
            if(freq == -1){
                freq = value;
            }
            else if(value != freq){
                same = false;
                break;
            }

        }
        return same;
    }
}