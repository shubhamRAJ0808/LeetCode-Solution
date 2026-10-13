class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);

        }
        int ans =-1;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            
            int maxFreq = entry.getValue();
            int maxVal = entry.getKey();
            if(maxFreq == maxVal){
                ans = Math.max(ans,maxVal);
            }
        }
        return ans;
        
    }
}