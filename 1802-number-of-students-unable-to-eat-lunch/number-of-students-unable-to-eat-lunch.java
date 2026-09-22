class Solution {
    public int countStudents(int[] stud, int[] sand) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < stud.length; i++) q.add(stud[i]);   // preference daalo
        for (int i = sand.length - 1; i >= 0; i--) st.push(sand[i]); // taaki peek() = sand[0] (top) ho

        int rotations = 0;

        while (!q.isEmpty() && rotations < q.size()) {
            if (q.peek().equals(st.peek())) {
                q.remove();
                st.pop();
                rotations = 0;  // ek match hua, counter reset karo
            } else {
                q.add(q.remove());
                rotations++;    // ek refuse hua
            }
        }

        return q.size();
    }
}