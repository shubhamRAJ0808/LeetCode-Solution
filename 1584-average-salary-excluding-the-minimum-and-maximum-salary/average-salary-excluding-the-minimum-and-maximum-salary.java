class Solution {
    public double average(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
            sum += arr[i];
        }
        double AvgSum = sum-max-min;
        double avg = AvgSum/(arr.length-2);
        return avg;
        
    }
}