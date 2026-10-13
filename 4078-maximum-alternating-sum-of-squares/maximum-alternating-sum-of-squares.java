class Solution {
    public long maxAlternatingSum(int[] arr) {
        //int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        int mid = arr.length/2;
        long result = 0;
        for(int i=0; i<mid; i++){
            result -= arr[i];
        }
        for(int i=mid; i<arr.length;i++){
            result += arr[i];
        }
        return result;
    }
}