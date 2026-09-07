class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];

        return Math.max(robInRange(nums,0,n-2),
                            robInRange(nums, 1, n-1));
      
    }

    private int robInRange(int[] nums, int i, int j){

        int n = j - i + 1;

        if(n == 1) return nums[i];

        int[] dp = new int[n];
        dp[0] = nums[i];
        dp[1] = Math.max(nums[i], nums[i+1]);

        for(int x = 2; x < n; x++){
            dp[x] = Math.max(dp[x-1], dp[x-2] + nums[i+x]);
        }
        return dp[n - 1];
    }
}