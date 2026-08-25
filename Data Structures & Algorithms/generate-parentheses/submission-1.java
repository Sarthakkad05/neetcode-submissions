class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack(n, 0, 0, new StringBuilder());
        return ans;
    }

    private void backtrack(int n, int open, int close, StringBuilder cur){

        if(cur.length() == 2 * n){
            ans.add(cur.toString());
            return;
        }

        if(open < n){
            cur.append("(");
            backtrack(n, open + 1, close, cur);
            cur.deleteCharAt(cur.length() - 1);
        }

        if(close < open){
            cur.append(")");
            backtrack(n, open, close + 1, cur);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
