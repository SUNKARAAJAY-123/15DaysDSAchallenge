class CoinChange {
    public int coinChange(int[] coins, int amount) {
        // dp[i] = minimum coins needed for amount i
        int[] dp = new int[amount + 1];
        // Fill with a large value (infinity equivalent)
        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
        }
        dp[0] = 0;

        // Build up dp array
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        CoinChange sol = new CoinChange();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int result = sol.coinChange(coins, amount);
        System.out.println("Minimum coins needed: " + result); // Output: 3
    }
}
