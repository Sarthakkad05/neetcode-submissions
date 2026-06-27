class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        backtrack(0, nums);
        return ans;
    }

    private void backtrack(int index, int[] nums){

        if(index == nums.length){

            List<Integer> curr = new ArrayList<>();

            for(int num: nums){
                curr.add(num);
            }

            ans.add(curr);
            return;
        }

        for(int i = index; i < nums.length; i++){

            swap(nums, index, i);

            backtrack(index + 1, nums);

            swap(nums, index, i);
            
        }
    }

     private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
