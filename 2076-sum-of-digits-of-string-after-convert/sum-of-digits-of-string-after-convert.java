class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int digit = (ch-'a')+1;
            sb.append(digit);
        }
        int sum = 0;
        for(int i=0; i<sb.length();i++){
            sum += sb.charAt(i)-'0';
        }
        
        for(int i=1;i<k;i++){
            int finalSum = 0;
            while(sum>0){
                int digit = sum %10;
                finalSum += digit;
                sum /=10;
            }
            sum = finalSum;
        }
        return sum;
        
    }
}