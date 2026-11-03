class Solution {
    public int numRescueBoats(int[] arr, int limit) {
        Arrays.sort(arr);
        int count =0;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            if(arr[start] + arr[end] <= limit) start++;
            end--;
            count++;
        }
        return count;
    }
}