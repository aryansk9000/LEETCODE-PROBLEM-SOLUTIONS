/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root == null) return paths;
        constructPaths(root, "", paths);
        return paths;
    }
    private void constructPaths(TreeNode node, String path, List<String> paths) {
        if (node != null) {
            path += Integer.toString(node.val);
            if (node.left == null && node.right == null) {
                paths.add(path);
            } else {
                path += "->";
                constructPaths(node.left, path, paths);
                constructPaths(node.right, path, paths);
            }
        }
    }
}
