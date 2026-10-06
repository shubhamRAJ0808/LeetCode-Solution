class Solution {
    public int sumOfUnique(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr) map.put(ele,map.getOrDefault(ele,0)+1);

        for(int num : arr){
            if(map.get(num)==1){
                list.add(num);
            }
        }
        int sum = 0;
        for(int i=0; i<list.size();i++){
            sum += list.get(i);
        }
        return sum;
        
    }
}