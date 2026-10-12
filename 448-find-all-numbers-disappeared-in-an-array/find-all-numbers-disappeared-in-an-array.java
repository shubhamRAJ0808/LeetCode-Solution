class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
        
    }
}