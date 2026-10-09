class Solution {
    public int largestAltitude(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            list.add(sum);
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        if(max<0) return 0;
        return max;
        
    }
}