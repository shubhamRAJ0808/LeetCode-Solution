class Solution {
    public int[] intersect(int[] arr, int[] brr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        // Dono arrays me numbers count karein
        for(int ele : arr){
            map.put(ele, map.getOrDefault(ele,0) + 1);
        }
        
        for(int i = 0; i < brr.length; i++){
            // Check karn h ki key map mein hai aur uska count 0 se bada hai
            if(map.containsKey(brr[i]) && map.get(brr[i]) > 0) {
                list.add(brr[i]);
                // Ek baar use ho gaya, toh uska count decrease kar na h
                map.put(brr[i], map.get(brr[i]) - 1);
            }
        }
        
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}