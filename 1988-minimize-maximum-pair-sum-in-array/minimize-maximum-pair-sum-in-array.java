class Solution {
    public int minPairSum(int[] arr) {
        Arrays.sort(arr);
        int start =0;
        int end = arr.length-1;
        int maxSum =0;
        while(start<end){
            if(arr[start]+arr[end]>maxSum){
                maxSum = arr[start]+arr[end];
            }
            start++;
            end--;
        }
        return maxSum;
    }
}