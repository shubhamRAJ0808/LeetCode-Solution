class Solution {
    public int minimumChairs(String s) {
        int count = 0;
        int max = 0;
        for(int i =0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'E'){
                count++;
                max = Math.max(max,count);
            }
            else{
                count--;
            }
        }
        return max;
    }
}