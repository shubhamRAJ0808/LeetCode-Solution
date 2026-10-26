class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int ele : nums1){
            set1.add(ele);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int ele: nums2){
            set2.add(ele);
        }
        HashSet<Integer> set3 = new HashSet<>();
        for(int ele : nums3){
            set3.add(ele);
        }
        

        // chechk and add the elements
        HashSet<Integer> ans = new HashSet<>();
        for(int ele : set1){
            if(set2.contains(ele) || set3.contains(ele)){
                ans.add(ele);
            }
        }
        for(int ele : set2){
            if(set1.contains(ele) || set3.contains(ele)){
                ans.add(ele);
            }
        }
        for(int ele : set3){
            if(set2.contains(ele) || set1.contains(ele)){
                ans.add(ele);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(ans);
        return list;
    }
}