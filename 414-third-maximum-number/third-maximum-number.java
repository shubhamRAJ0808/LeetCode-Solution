class Solution {
    public int thirdMax(int[] arr) {
        long max = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for(int num : arr){
            if(num>max){
            thirdMax = secMax;
            secMax = max;
            max = num;
            }
            else if(num>secMax && num != max){
                thirdMax = secMax;
                secMax = num;
            }
            else if (num>thirdMax && num != secMax && num != max){
                thirdMax = num;
            }

        }
        if (thirdMax == Long.MIN_VALUE) {
            return (int) max;
        }
        return (int) thirdMax;
    }
        
}