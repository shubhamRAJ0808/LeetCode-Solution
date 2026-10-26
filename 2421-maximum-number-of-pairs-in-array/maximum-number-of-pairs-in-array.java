
class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        int countPairs = 0;
        int leftOver = 0;
        for (int val : map.values()) {
            countPairs += val / 2;
            leftOver += val % 2;
        }
        return new int[]{countPairs, leftOver};
    }
}
