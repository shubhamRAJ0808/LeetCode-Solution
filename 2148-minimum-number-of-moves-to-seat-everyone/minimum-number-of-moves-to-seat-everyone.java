class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int cost =0;
        for(int i=0;i<seats.length;i++){
            int dis = Math.abs(seats[i]-students[i]);
            cost += dis;
        }
        return cost;
    }
}