class Solution {
    public int[] rearrangeArray(int[] arr) {
        int pos = 0;
        int neg =1;
        int[] ans = new int[arr.length];
        for(int ele : arr){
            if(ele>0){
                ans[pos] = ele;
                pos += 2;
            }
            else{
                ans[neg] = ele;
                neg += 2;
            }
        }
        return ans;
    }
}