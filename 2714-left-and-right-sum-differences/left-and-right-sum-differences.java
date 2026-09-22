class Solution { 
    public int[] leftRightDifference(int[] nums) { 
        int n = nums.length; 
 
        ArrayList<Integer> list1 = new ArrayList<>(); 
        ArrayList<Integer> list2 = new ArrayList<>(); 
        ArrayList<Integer> list3 = new ArrayList<>(); 
        
        int res1 = 0; 
        int res2 = 0; 
 
        list1.add(0); 
 
        // LEFT SUM
        for(int i = 1; i < n; i++){ 
            res1 = res1 + nums[i-1]; 
            list1.add(res1);  
        } 
 
        // RIGHT SUM
        list2.add(0);
        
        for(int i = n-2; i >= 0; i--){ 
            res2 = res2 + nums[i+1]; 
            list2.add(0, res2); 
        } 
 
        // DIFFERENCE
        for(int i = 0; i < n; i++){ 
            int ans = Math.abs(list1.get(i) - list2.get(i)); 
            list3.add(ans); 
        } 
 
        int[] arr = new int[list3.size()]; 
        
        for(int i = 0; i < list3.size(); i++){ 
            arr[i] = list3.get(i); 
        } 
        
        return arr; 
    } 
}