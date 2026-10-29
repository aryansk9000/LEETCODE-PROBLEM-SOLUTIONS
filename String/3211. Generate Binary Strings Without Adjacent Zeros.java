class Solution {
    private List<String> result;
    public List<String> validStrings(int n) {
        result = new ArrayList<>();
        backtrack("", n, '1');
        return result;
    }
    private void backtrack(String s, int n, char prev) {
        if (s.length() == n) {
            result.add(s);
            return;
        }
        backtrack(s +"1", n,'1');
        if (s.length() == 0 || prev != '0') {
            backtrack(s + "0", n, '0');
        }
    }
}
