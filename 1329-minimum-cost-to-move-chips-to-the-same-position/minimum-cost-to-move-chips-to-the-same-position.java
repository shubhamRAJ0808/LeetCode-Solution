class Solution {
    public int minCostToMoveChips(int[] arr) {
        int evenCount =0;
        int oddCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        return Math.min(evenCount,oddCount);
    }
}