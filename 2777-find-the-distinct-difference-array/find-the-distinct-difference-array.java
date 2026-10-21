class Solution {
    public int[] distinctDifferenceArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for(int i=0; i<n;i++){
            HashSet<Integer> prefix = new HashSet<>();
            for(int j=0; j<=i;j++){
                prefix.add(arr[j]);
            }
            HashSet<Integer> suffix = new HashSet<>();
            for(int j=i+1; j<n;j++){
                suffix.add(arr[j]);
            }

            ans[i] = prefix.size()-suffix.size();
        }
        return ans;
        
        
    }
}