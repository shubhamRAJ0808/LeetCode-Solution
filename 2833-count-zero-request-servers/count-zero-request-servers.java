import java.util.Arrays;

class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int m = logs.length;
        int q = queries.length;
        
        
        Arrays.sort(logs, (a, b) -> Integer.compare(a[1], b[1]));
        
        
        int[][] sortedQueries = new int[q][2];
        for (int i = 0; i < q; i++) {
            sortedQueries[i][0] = queries[i];
            sortedQueries[i][1] = i;
        }
        Arrays.sort(sortedQueries, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] ans = new int[q];
        int[] serverCount = new int[n + 1];
        int activeServers = 0;
        
        int left = 0, right = 0;
        
        for (int i = 0; i < q; i++) {
            int queryTime = sortedQueries[i][0];
            int originalIndex = sortedQueries[i][1];
            int windowStart = queryTime - x;
            int windowEnd = queryTime;
            
           
            while (right < m && logs[right][1] <= windowEnd) {
                int serverId = logs[right][0];
                if (serverCount[serverId] == 0) {
                    activeServers++;
                }
                serverCount[serverId]++;
                right++;
            }
            
           
            while (left < m && logs[left][1] < windowStart) {
                int serverId = logs[left][0];
                serverCount[serverId]--;
                if (serverCount[serverId] == 0) {
                    activeServers--;
                }
                left++;
            }
            
          
            ans[originalIndex] = n - activeServers;
        }
        
        return ans;
    }
}