class Solution {
    public int[] runningSum(int[] arr) {
        int n = arr.length;
        //int[] runnnigSum = new int[n];

        for(int i=1; i<n;i++){
            arr[i] = arr[i] +arr[i-1];

        }
        return arr;
        
    }
}