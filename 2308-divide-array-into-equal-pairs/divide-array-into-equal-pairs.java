class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        boolean pair = true;
        for(int val : map.values()){
            if(val % 2 != 0){
                pair = false;
                break;
            }
        }
        return pair;
    }
}