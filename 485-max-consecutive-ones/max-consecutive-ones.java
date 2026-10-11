class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count =0;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            //if(arr[i]==0) count = 0;
            if(arr[i]==1){
                count++;
                max = Math.max(count,max);
            }
            else{
                count = 0;
            }
            
        }
        return max;
        
    }
}