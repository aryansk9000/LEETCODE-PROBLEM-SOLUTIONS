import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        dfs(rooms, 0, visited);
        return visited.size() == rooms.size();
    }
    private void dfs(List<List<Integer>> rooms, int currentRoom, Set<Integer> visited) {
        for (int key : rooms.get(currentRoom)) {
            if (!visited.contains(key)) {
                visited.add(key);
                dfs(rooms, key, visited);
            }
        }
    }
}
