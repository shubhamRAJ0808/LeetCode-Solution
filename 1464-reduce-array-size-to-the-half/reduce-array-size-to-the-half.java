class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        ArrayList<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq);

        int removeEle = 0;
        int setSize =0;
        int target = arr.length/2;
        for(int i=freq.size()-1;i>=0;i--){
            removeEle += freq.get(i);
            setSize++;
            if(removeEle>= target){
                break;
            } 
        }
        return setSize;
    }
}