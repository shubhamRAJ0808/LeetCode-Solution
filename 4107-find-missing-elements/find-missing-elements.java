class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            if(arr[i]> max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        for(int ele : arr) set.add(ele);
        for(int i=min;i<=max;i++){
            if(!set.contains(i)) ans.add(i);
            
        }
        // for(int num : set){
        //     ans.add(num);
        // }
        // Collections.sort(ans);
        return ans;
        
        
    }
}