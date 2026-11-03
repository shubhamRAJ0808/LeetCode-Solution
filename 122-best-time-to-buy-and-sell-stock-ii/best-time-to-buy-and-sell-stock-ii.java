class Solution {
    public int maxProfit(int[] arr) {
        int totProfit =0;
        for(int i=0;i<arr.length-1;i++){
            int profit = arr[i+1] - arr[i];
            if(profit>0){
                totProfit += profit;
            }
        }
        return totProfit;
    }
}