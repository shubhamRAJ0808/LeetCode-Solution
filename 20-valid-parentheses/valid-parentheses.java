import java.util.Stack;

class Solution {

    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }

            // Closing brackets
            else {

                // Stack empty
                if (st.isEmpty()) {
                    return false;
                }

                // Matching check
                if ((ch == ')' && st.peek() == '(') ||
                    (ch == '}' && st.peek() == '{') ||
                    (ch == ']' && st.peek() == '[')) {

                    st.pop();
                }
                else {
                    return false;
                }
            }
        }

        // Stack should be empty
        return st.isEmpty();
    }
}