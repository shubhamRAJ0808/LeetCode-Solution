class Solution {
    public int waysToSplitArray(int[] arr) {
        long totalSum =0;
        for(int i=0;i<arr.length;i++){
            totalSum += arr[i];
        }
        long left = arr[0];
        int count =0;
        for(int i=0;i<arr.length-1;i++){
            if(left>= totalSum-left) count++;
            left += arr[i+1];
        }
        return count;
        
    }
}