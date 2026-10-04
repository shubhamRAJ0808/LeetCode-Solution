class Solution {
    public int[] distributeCandies(int candies, int num_people) {

        int[] ans = new int[num_people];

        int n = 1; // candies dena
        int i = 0; // kis index pe

        while (candies > 0) {

            if (candies >= n) {
                ans[i] = ans[i] + n;
                candies = candies - n;
            } 
            else {
                ans[i] = ans[i] + candies;
                candies = 0;
            }

            n++;
            i++;

            if (i == num_people) {
                i = 0;
            }
        }

        return ans;
    }
}