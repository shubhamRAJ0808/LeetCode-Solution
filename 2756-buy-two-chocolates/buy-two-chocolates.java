class Solution {
    public int buyChoco(int[] arr, int tar) {
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                secMin = min;
                min = arr[i];
            }
            else if(arr[i]<secMin){
                secMin = arr[i];
            }
            
        }
        int cost = min + secMin;
        if(cost <= tar){
            return tar-cost;
        }
        return tar;
    }
}