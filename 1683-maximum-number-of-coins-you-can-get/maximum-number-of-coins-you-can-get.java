class Solution {
    public int maxCoins(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int sum =0;
        for(int i=n-2; i>=n/3; i=i-2){
            sum += arr[i];
            
        }
        return sum;
    }
}