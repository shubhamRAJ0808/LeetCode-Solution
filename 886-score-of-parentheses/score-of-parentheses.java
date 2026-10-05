class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(0); // yeh level ans banega
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(') st.push(0); // yeh level expand karega
            else{
                int v = st.pop(); // 
                int score = (v == 0) ? 1 : 2*v;
                st.push(st.pop()+score); // add from the previous level;
            }
        } 
        return st.pop();
        
    }
}