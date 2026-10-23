class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
            if(nums[i]<min){
                min = nums[i];
            }
        }
        int ans = 1;
        for(int i=1; i<=min;i++){
            if(max % i==0 && min % i==0){
                ans = i;
            }
        }
        return ans;
    }
}