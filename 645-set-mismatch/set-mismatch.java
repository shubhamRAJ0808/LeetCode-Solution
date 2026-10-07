class Solution {
    public int[] findErrorNums(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        int maxfreq =0;
        int duplicate = 0;
        int sum =0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>maxfreq){
                maxfreq = entry.getValue();
                duplicate = entry.getKey(); 
            }
            
        }
        int missEle = 0;
        for(int i=1; i<=arr.length;i++){
            if(!map.containsKey(i)){
                missEle = i;
                break;
            }
        }
        list.add(duplicate);
        list.add(missEle);
        return new int[]{list.get(0),list.get(1)};
        

    }
}