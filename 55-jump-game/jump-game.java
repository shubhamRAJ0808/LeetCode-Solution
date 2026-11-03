class Solution {
    public boolean canJump(int[] nums) {
        int maxDis = 0;
        for(int i=0;i<nums.length;i++){
            if(i>maxDis){
                return false;
            }
            maxDis = Math.max(maxDis,i+nums[i]);

            if(maxDis >= nums.length-1) return true;
        }
        return true;
    }
}