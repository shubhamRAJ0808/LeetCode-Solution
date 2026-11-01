class Solution {
    public int[] minOperations(String s) {
        int n = s.length();
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=0;j<n;j++){
                if(s.charAt(j)=='1'){
                    sum += Math.abs(i-j);
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}