class Solution {
    public int distributeCandies(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr ){
            set.add(ele);
        }
        int min = Math.min(set.size(),arr.length/2);
        return min;
    }
}