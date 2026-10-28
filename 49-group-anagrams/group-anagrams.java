class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
        List<List<String>> list = new ArrayList<>();

        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<str.length;i++){
            char[] arr = str[i].toCharArray();
            Arrays.sort(arr);
            String t = new String(arr);
            if(!map.containsKey(t)){
                map.put(t,new ArrayList<>());
            }
            map.get(t).add(str[i]);
        }
        return new ArrayList<>(map.values());
        
    }
}