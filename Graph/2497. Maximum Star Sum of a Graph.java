import java.util.*;
class Solution {
    public int maxStarSum(int[] vals, int[][] edges, int k) {
        int n = vals.length;
        List<Integer>[] graph = new List[n];
        Arrays.setAll(graph, i -> new ArrayList<>());
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            if (vals[v] > 0) graph[u].add(vals[v]);
            if (vals[u] > 0) graph[v].add(vals[u]);
        }
        for (List<Integer> neighbors : graph) {
            neighbors.sort((a, b) -> b - a);
        }
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = vals[i];
            for (int j = 0; j < Math.min(k, graph[i].size()); j++) {
                sum += graph[i].get(j);
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
