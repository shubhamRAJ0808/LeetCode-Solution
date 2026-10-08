class Solution {
    public int maxProduct(int[] arr) {
        int max =Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secMax = max;
                max = arr[i];
            }
            else if(arr[i]>secMax){
                secMax = arr[i];
            }
        }
        int maxProd = (max-1) * (secMax-1);
        return maxProd;
        
    }
}