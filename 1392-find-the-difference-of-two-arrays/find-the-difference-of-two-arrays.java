
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int ele : nums1) {
            set1.add(ele);
        }
        for (int ele : nums2) {
            set2.add(ele);
        }

        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> row1 = new ArrayList<>();
        for (int ele : set1) {
            if (!set2.contains(ele)) {
                row1.add(ele);
            }
        }
        ArrayList<Integer> row2 = new ArrayList<>();
        for (int ele : set2) {
            if (!set1.contains(ele)) {
                row2.add(ele);
            }
        }
        list.add(row1);
        list.add(row2);
        return list;
    }
}
