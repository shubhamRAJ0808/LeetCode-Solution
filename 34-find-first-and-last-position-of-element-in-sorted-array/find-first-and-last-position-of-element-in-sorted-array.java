//import java.util.ArrayList;
class Solution {
    public int[] searchRange(int[] nums, int target) {
       //ArrayList<Integer> res = new ArrayList<>();
        int[] ans = {-1, -1};


        // For First Occurance
        int low =0;
        int high = nums.length-1;
        //int first = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]<target) low = mid+1;
            else if(nums[mid]>target) high = mid-1;
            else {
                ans[0] = mid;
                high = mid-1;
            } 

        }
        // last occurance
        low=0;
        high = nums.length-1;
        //int last = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]<target) low = mid+1;
            else if(nums[mid]>target) high = mid-1;
            else {
                ans[1] = mid;
                low = mid+1;
            } 
        }
        // res.add(first);
        // res.add(last);
        return ans;
    }

        
    
}