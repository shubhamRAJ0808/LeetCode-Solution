class Solution {
    public String customSortString(String order, String s) {
       StringBuilder sb = new StringBuilder();
       HashMap<Character,Integer> map = new HashMap<>();
       for(char ch : s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
       } 
       for(char ch : order.toCharArray()){
        if(map.containsKey(ch)){
            while(map.get(ch)>0){
                sb.append(ch);
                map.put(ch,map.get(ch)-1);
            }
            
        }
       }
       for(char key : map.keySet()){
        while(map.get(key)>0){
            sb.append(key);
            map.put(key,map.get(key)-1);
        }
        
       }
       return sb.toString();
    }
}