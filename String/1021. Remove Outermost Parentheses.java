class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res=new StringBuilder();
        int balance=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(balance>0) res.append(c);
                balance++;
            } else{
                balance--;
                if(balance>0) res.append(c);
            }
        }
        return res.toString();
    }
}
