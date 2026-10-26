class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int start =0;
        int end = nums.length-1;
        while(start<nums.length && end>=0){
            if(nums[start]%2==0){
                start += 2;
            }
            else if(nums[end]%2==0){
                int temp = nums[end];
                nums[end] = nums[start];
                nums[start] = temp;
                start +=2;
                end -= 2;
            }
            else{
                end -=2;
            }

        }
        return nums;
    }
}