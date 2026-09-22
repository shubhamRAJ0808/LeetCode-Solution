class Solution {
    public int maxProductDifference(int[] arr ) {
        Arrays.sort(arr);
        int n = arr.length;
        
        
        int minProd = arr[0] * arr[1];
        int maxProd = arr[n-1] * arr[n-2];

        return maxProd - minProd;
        
        
    }
}