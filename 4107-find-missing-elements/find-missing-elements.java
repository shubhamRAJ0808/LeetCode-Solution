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
        for(int i=min; i<= max; i++){
            set.add(i);
        }
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])) set.remove(arr[i]);
            //else ans.add(arr[i]);
        }
        for(int num : set){
            ans.add(num);
        }
        Collections.sort(ans);
        return ans;
        
        
    }
}