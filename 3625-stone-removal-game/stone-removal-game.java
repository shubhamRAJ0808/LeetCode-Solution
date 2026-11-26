class Solution {
    public boolean canAliceWin(int n) {
        int rem = 10;
        boolean flag = true;
        
        while (n >= rem) {
            n -= rem;
            rem--;
            flag = !flag;
        }
        
        return !flag;
    }
}