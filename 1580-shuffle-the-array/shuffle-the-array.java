class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[2 * n];
        int idx = 0;
        for(int i=0; i<2*n; i+=2){
            a[i] = nums[idx];
            a[i+1] = nums[idx+n];
            idx+=1;
        }
        return a;
    }
}