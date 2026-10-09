class Solution {
    public int largestAltitude(int[] arr) {
        int maxSum =0;
        int HighAlt = maxSum;
        for(int num : arr){
            maxSum = maxSum+num;
            HighAlt = Math.max(maxSum,HighAlt);
        }
        return HighAlt;
        
    }
}