class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char ch : arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch : target.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<target.length();i++){
            if(map.containsKey(target.charAt(i))){
                list.add(map.get(target.charAt(i)) / map2.get(target.charAt(i)));
            }
            else{
                return 0;   
            }
        }
        if(list.size()>1){
            int min = Integer.MAX_VALUE;
            for(int i=0;i<list.size();i++){
                if(list.get(i)<min){
                    min = list.get(i);
                }
            }
            return min;
        }
        else if(list.size()==1){
            int num = list.get(0);
            return num / target.length();
        }
        return 0;
        
    }
}