class Solution {
    public long findTheArrayConcVal(int[] arr) {
        int start =0;
        int end = arr.length-1;
        long ans = 0;
        while(start<end){
            String str = String.valueOf(arr[start]);
            String ptr = String.valueOf(arr[end]);
            String newStr = "" + str + ptr;
            ans += Long.parseLong(newStr);
            start++;
            end--;
        }
        if(start == end){
            ans += arr[start];
        }
        return ans;
    }
}