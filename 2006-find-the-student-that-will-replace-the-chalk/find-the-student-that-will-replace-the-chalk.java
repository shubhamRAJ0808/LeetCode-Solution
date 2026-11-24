class Solution {
    public int chalkReplacer(int[] arr, int k) {
        long sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        k %= sum;
        for(int i=0;i<arr.length;i++){
            if(k<arr[i]) return i;
            k -= arr[i];
        }
        return -1;
    }
}