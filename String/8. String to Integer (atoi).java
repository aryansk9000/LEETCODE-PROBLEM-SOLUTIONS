class Solution {
    public int myAtoi(String input) {
        int i = 0, n = input.length();
        while (i < n && input.charAt(i) == ' ') {
            i++;
        }
        int sign = 1;
        if (i < n && input.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && input.charAt(i) == '+') {
            i++;
        }
        long result = 0;
        while (i < n && Character.isDigit(input.charAt(i))) {
            result = result * 10 + (input.charAt(i) - '0');
            i++;
            if (result * sign >= Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign <= Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int)(result * sign);
    }
}
