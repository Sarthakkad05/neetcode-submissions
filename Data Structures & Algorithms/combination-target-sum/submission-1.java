class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
       backtrack(0, target, nums, new ArrayList<>());
       return ans;
    }

    private void backtrack(int index, int target, int[] nums, List<Integer> curr){

        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(target < 0 || index == nums.length){
            return;
        }

        curr.add(nums[index]);
        backtrack(index, target - nums[index], nums, curr);

        curr.remove(curr.size() - 1);

        backtrack(index + 1, target, nums, curr);
    }
}
