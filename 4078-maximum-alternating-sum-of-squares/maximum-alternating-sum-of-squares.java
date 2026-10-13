class Solution {
    public long maxAlternatingSum(int[] arr) {
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = arr[i] * arr[i];
        }
        Arrays.sort(ans);
        int mid = ans.length/2;
        long result = 0;
        for(int i=0; i<mid; i++){
            result -= ans[i];
        }
        for(int i=mid; i<ans.length;i++){
            result += ans[i];
        }
        return result;
    }
}