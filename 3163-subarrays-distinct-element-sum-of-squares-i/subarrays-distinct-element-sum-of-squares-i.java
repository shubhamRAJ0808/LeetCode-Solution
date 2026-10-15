class Solution {
    public int sumCounts(List<Integer> arr) {
        int ans =0;
        for(int i=0; i<arr.size();i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i;j<arr.size();j++){
                set.add(arr.get(j));

                int count = set.size();
                ans += count*count; 
            }
        }
        return ans;
    }
}