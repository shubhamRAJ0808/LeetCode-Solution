class Solution {
    public boolean isHappy(int n) {
        if(n<=0) return false;
        while(n != 1 && n!=4){  //n !=4 for the cycle detection to avoid the infinte loop;
            int sumSq = 0;
            while(n>0){
                int digit = n%10;
                sumSq += digit * digit;
                n= n/10;
            }
            n = sumSq;
        }
        
        return n==1;
        
    }
}