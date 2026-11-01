class Solution {
    public long dividePlayers(int[] arr) {
        Arrays.sort(arr);
        int start =0;
        int end = arr.length-1;
        int sum = arr[start]+arr[end];
        long finalSum = 0;
        while(start<end){
            if(arr[start]+arr[end] == sum){
                finalSum += (arr[start] * arr[end]);
                start++;
                end--; 
            }
            else{
                return -1;
            }
        }
        return finalSum;
    }
}