class Solution {
    public int removePalindromeSub(String s) {
        int left =0;
        int right = s.length()-1;
        boolean isPallindrome = true;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                isPallindrome = false;
            }
            left++;
            right--;
        }
        if(isPallindrome) return 1;
        
        return 2;
    }
}