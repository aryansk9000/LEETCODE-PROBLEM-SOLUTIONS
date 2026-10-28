import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(0, 0, n, "", result);
        return result;
    }
    private void backtrack(int open, int close, int n, String current, List<String> result) {
        if (open == close && open + close == 2 * n) {
            result.add(current);
            return;
        }
        if (open < n) {
            backtrack(open + 1, close, n, current + '(', result);
        }
        if (close < open) {
            backtrack(open, close + 1, n, current + ')', result);
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3; 
        List<String> result = sol.generateParenthesis(n);

        System.out.println("All combinations of balanced parentheses for n = " + n + " are:");
        for (String combination : result) {
            System.out.println(combination);
        }
    }
}
