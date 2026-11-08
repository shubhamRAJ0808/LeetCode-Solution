class Solution {
    public int partitionString(String s) {
        HashSet<Character> set = new HashSet<>();
        int parts = 1;
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                parts++;
                set.clear();
            }
            set.add(ch);
        }
        return parts;
    }
}