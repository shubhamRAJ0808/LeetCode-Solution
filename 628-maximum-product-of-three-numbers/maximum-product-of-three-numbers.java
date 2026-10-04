import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        
        int opt1 = arr[n-1] * arr[n-2] * arr[n-3];
        
        
        int opt2 = arr[0] * arr[1] * arr[n-1];
        
        return Math.max(opt1, opt2);
    }
}