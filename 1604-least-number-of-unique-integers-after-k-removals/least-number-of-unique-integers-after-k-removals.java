class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        int count = list.size();
        for(int ele : list){
            if(k>=ele){
                k -= ele;
                count--;
            }
            else{
                break;
            }
        }
        return count;
        
    }
}