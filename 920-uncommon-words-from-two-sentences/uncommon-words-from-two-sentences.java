class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        String[] str = s1.split(" ");
        String[] ptr = s2.split(" ");
        for(String st : str){
            map.put(st,map.getOrDefault(st,0)+1);
        }
        for(String tt : ptr){
            map.put(tt,map.getOrDefault(tt,0)+1);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }
        String[] s = new String[list.size()];
        for(int i=0;i<list.size();i++){
            s[i] = list.get(i);
        }
        return s;
    }
}