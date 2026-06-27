class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        backtrack(0, target, candidates, new ArrayList<>());
        return ans;
    }

    private void backtrack(int index, int target, int[] candidates, List<Integer> curr){

        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0 || index == candidates.length){
            return;
        }

        for(int i = index; i < candidates.length; i++){

            if(i > index && candidates[i] == candidates[i-1]){
                continue;
            }

            if (candidates[i] > target) {
                break;
            }

            curr.add(candidates[i]);
            backtrack(i + 1, target - candidates[i], candidates, curr);

            curr.remove(curr.size() - 1);
        }
    }
}
