class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }
        int count =0;
        for(int ele : set){
            if(set.contains(ele+diff) && set.contains(ele+2*diff)){
                count++;
            }
        }
        return count;
    }
}