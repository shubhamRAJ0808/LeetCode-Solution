
class Solution {
    public int maximumValue(String[] str) {
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            boolean isNumber = true;

            for (int j = 0; j < str[i].length(); j++) {
                if (!Character.isDigit(str[i].charAt(j))) {
                    isNumber = false;
                    break;
                }
            }
            int value =0;
            if (isNumber) {
                value = Integer.parseInt(str[i]);
            } else {
                value = str[i].length();
            }

            max = Math.max(max, value);
        }

        return max;
    }
}
