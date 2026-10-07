class Solution {

    public List<String> removeInvalidParentheses(String s) {

        List<String> ans = new ArrayList<>();

        int left = 0;
        int right = 0;

        // Find minimum invalid parentheses
        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                left++;
            } 
            else if (ch == ')') {

                if (left > 0) {
                    left--;
                } 
                else {
                    right++;
                }
            }
        }

        backtrack(s, 0, left, right, ans);

        return ans;
    }

    void backtrack(String s, int start,
                   int leftRemove,
                   int rightRemove,
                   List<String> ans) {

        // If removals are finished, check validity
        if (leftRemove == 0 && rightRemove == 0) {

            if (isValid(s)) {
                ans.add(s);
            }

            return;
        }

        for (int i = start; i < s.length(); i++) {

            // Skip duplicate parentheses
            if (i > start && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            }

            // Remove '('
            if (leftRemove > 0 && s.charAt(i) == '(') {

                String next =
                    s.substring(0, i) + s.substring(i + 1);

                backtrack(
                    next,
                    i,
                    leftRemove - 1,
                    rightRemove,
                    ans
                );
            }

            // Remove ')'
            if (rightRemove > 0 && s.charAt(i) == ')') {

                String next =
                    s.substring(0, i) + s.substring(i + 1);

                backtrack(
                    next,
                    i,
                    leftRemove,
                    rightRemove - 1,
                    ans
                );
            }
        }
    }

    boolean isValid(String s) {

        int count = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                count++;
            }

            else if (ch == ')') {

                count--;

                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }
}