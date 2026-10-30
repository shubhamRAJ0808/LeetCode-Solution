class Solution {
    public int maximumDifference(int[] arr) {
        int diff = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int d = arr[j]-arr[i];
                    diff = Math.max(diff,d);
                }
            }
        }
        if(diff == 0) return -1;
        return diff;
    }
}