class Solution {
    public int minMoves2(int[] arr) {
       Arrays.sort(arr);
       int target = arr[arr.length/2];
       int sum =0;
       for(int i=0;i<arr.length;i++){
        sum += Math.abs(arr[i]-target);
       }
       return sum;
    }
}