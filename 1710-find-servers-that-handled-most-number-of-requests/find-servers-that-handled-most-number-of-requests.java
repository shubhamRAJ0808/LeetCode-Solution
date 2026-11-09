class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        int[] count = new int[k];
        TreeSet<Integer> free = new TreeSet<>();
        for (int i = 0; i < k; i++) {
            free.add(i);
        }
        
        PriorityQueue<int[]> busy = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < arrival.length; i++) {
            int t = arrival[i];
            
            while (!busy.isEmpty() && busy.peek()[0] <= t) {
                free.add(busy.poll()[1]);
            }
            
            if (free.isEmpty()) {
                continue;
            }
            
            Integer server = free.ceiling(i % k);
            if (server == null) {
                server = free.first();
            }
            
            count[server]++;
            busy.offer(new int[]{t + load[i], server});
            free.remove(server);
        }

        int maxReq = 0;
        for (int c : count) {
            maxReq = Math.max(maxReq, c);
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            if (count[i] == maxReq) {
                result.add(i);
            }
        }

        return result;
    }
}