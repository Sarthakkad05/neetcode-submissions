class Solution {
    public int change(int amount, int[] coins) {
        
        int[] dp = new int[amount + 1];

        dp[0] = 1;

        //If I use this coin, how many ways were there to make the remaining amount?
        for(int coin : coins){

            for(int i = coin; i <= amount; i++){
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}
