class Solution {
    public int alternateDigitSum(int n) {
        int length=0;
        int temp = n;
        while(temp>0){
            temp /= 10;
            length++;
        }
        int sum = 0;
        
        while(n>0){
            int digit = n % 10;
            if(length % 2 == 1){
                sum += digit;
            }
            else{
                sum -= digit;
            }
            n /= 10;
            length--;
        }
        return sum;
        
    }
}