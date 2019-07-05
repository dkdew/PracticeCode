

import java.util.Arrays;

/**
 * Created by Dinesh Dewangan on 28/06/19.
 */
public class CoinChange {

    public static void main(String ar[]) {
        int coins[] = {1, 2, 5};
        System.out.println(numberOfCoins(coins, 7));
    }

    public static int numberOfCoins(int coins[], int amount) {
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }

        return dp[amount] < (amount + 1) ? dp[amount] : -1;
    }
}
