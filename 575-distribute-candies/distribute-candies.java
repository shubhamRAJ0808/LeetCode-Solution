class Solution {
    public int distributeCandies(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr ){
            set.add(ele);
        }
        return Math.min(set.size(),arr.length/2);
    }
}