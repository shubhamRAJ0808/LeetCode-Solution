
class Solution {
    public boolean checkRecord(String s) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'A') {
                count1++;
            }

            if (ch == 'L') {
                count2++;
            } else {
                count2 = 0;
            }

            if (count1 >= 2 || count2 >= 3) {
                return false;
            }
        }

        return true;
    }
}
