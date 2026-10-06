class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double windowSum = 0;
        //double avg = 0;

        for(int i=0; i<k;i++){
            windowSum += arr[i];
            
        }
        double maxSum = windowSum;
        for(int i=k; i<arr.length;i++){
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(maxSum,windowSum);
        }
        double avg = maxSum/k;
        return avg;

        
    }
}