class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int freq =-1;
        HashSet<Integer> set = new HashSet<>();
        for(int val : map.values()){
            set.add(val);
        }
        return map.size() == set.size();
    }
}