class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtrack(n,k,1, new ArrayList<>());
        return ans;    
    }

    private void backtrack(int n, int k, int start, List<Integer> comb){

        if(comb.size() == k){
            ans.add(new ArrayList<>(comb));
        }

        for(int i = start; i <= n; i++){

            comb.add(i);
            backtrack(n,k, i + 1, comb);
            comb.remove(comb.size() - 1);
        }
    }
}