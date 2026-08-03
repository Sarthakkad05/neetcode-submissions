class Solution {

    public boolean canPartitionKSubsets(int[] nums, int k) {

        int sum = 0;
        for (int num : nums)
            sum += num;

        if (sum % k != 0)
            return false;

        int target = sum / k;

        Arrays.sort(nums);

        // Reverse to descending order
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        if (nums[0] > target)
            return false;

        boolean[] used = new boolean[nums.length];

        return backtrack(nums, used, k, 0, 0, target);
    }

    private boolean backtrack(int[] nums, boolean[] used,
                              int k, int start,
                              int currentSum, int target) {

        // Only one subset left
        if (k == 1)
            return true;

        // Current subset completed
        if (currentSum == target)
            return backtrack(nums, used, k - 1, 0, 0, target);

        for (int i = start; i < nums.length; i++) {

            if (used[i])
                continue;

            if (currentSum + nums[i] > target)
                continue;

            used[i] = true;

            if (backtrack(nums, used, k, i + 1,
                    currentSum + nums[i], target))
                return true;

            used[i] = false;

            // Pruning
            if (currentSum == 0)
                return false;

            while (i + 1 < nums.length && nums[i] == nums[i + 1])
                i++;
        }

        return false;
    }
}