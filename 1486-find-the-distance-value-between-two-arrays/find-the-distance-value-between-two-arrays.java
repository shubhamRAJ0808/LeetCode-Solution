class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int distanceValue = 0;
        
        for (int x : arr1) {
            if (isValid(x, arr2, d)) {
                distanceValue++;
            }
        }
        
        return distanceValue;
    }
    private boolean isValid(int x, int[] arr2, int d) {
        int left = 0;
        int right = arr2.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (Math.abs(x - arr2[mid]) <= d) {
                return false;
            }
            
            if (arr2[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return true;
    }
}