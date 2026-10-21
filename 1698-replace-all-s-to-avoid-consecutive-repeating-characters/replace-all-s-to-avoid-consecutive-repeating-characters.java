
class Solution {
    public String modifyString(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                for (char c = 'a'; c <= 'c'; c++) {
                    boolean left = i > 0 && arr[i - 1] == c;
                    boolean right = i < arr.length - 1 && arr[i + 1] == c;

                    if (!left && !right) {
                        arr[i] = c;
                        break;
                    }
                }
            }
        }
        return new String(arr);
    }
}
