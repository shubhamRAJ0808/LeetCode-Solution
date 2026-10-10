class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele : arr){
            set.add(ele);
        }   
        int count =0;
        for(int i=1; ;i++){
            if(!set.contains(i)){
                count++;
                if(count==k) return i;
            }
        }
        
    }
}