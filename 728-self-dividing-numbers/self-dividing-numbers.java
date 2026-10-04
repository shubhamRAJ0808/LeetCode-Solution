class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i=left; i<=right; i++){
            ArrayList<Integer> list = new ArrayList<>();
            int temp = i;
            while(temp>0){
                int digit = temp % 10;
                // digit 0 nahi hona chahiye
                if(digit == 0) break;
                list.add(digit);
                temp = temp/10; 
            }
            boolean flag = true;
            for(int j=0; j<list.size();j++){
                if(i % list.get(j)!=0){
                    flag = false;
                } 
            }
            if(flag && temp ==0){
                ans.add(i);
            }
        }
        return ans;
        
    }
}