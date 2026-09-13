import java.util.*;
class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int maxArea = 0;
        for (char[] row : matrix) {
            for (int j = 0; j < cols; j++) {
                if (row[j] == '1')
                    heights[j]++;
                else
                    heights[j] = 0;
            }
            maxArea = Math.max(maxArea, largestRectangle(heights));
        }
        return maxArea;
    }
    private int largestRectangle(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= heights.length; i++) {
            int current = (i == heights.length) ? 0 : heights[i];
            while (!stack.isEmpty() && current < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty()
                        ? i
                        : i - stack.peek() - 1;
                int area = height * width;
                maxAreaHolder = Math.max(maxAreaHolder, area);
            }
            stack.push(i);
        }
        return maxAreaHolder;
    }
    private int maxAreaHolder = 0;
}
