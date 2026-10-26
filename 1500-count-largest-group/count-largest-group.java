class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum =0;
            int num = i;
            while(num>0){
                int digit =num % 10;
                sum += digit;
                num /= 10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        int maxFreq =0;
        for(int ele : map.values()){
            maxFreq = Math.max(maxFreq,ele);
        }
        int count =0;
        for(int val : map.values()){
            if(val == maxFreq){
                count++;
            }
        }
        return count;
        
    }
}