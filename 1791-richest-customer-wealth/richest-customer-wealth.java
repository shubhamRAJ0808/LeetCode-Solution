class Solution {
    public int maximumWealth(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){ // Rows
            int sum =0;
            for(int j=0;j<arr[i].length;j++){ // col
                sum = sum+ arr[i][j];
                list.add(sum);
            }
        }
        int maxWelth = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>maxWelth) maxWelth = list.get(i);
        }
        return maxWelth;
        
        
    }
}