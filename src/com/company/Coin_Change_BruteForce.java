package com.company;
import java.util.*;
import java.math.*;
public class Coin_Change_BruteForce {

    public int getMinNumberOfCoins(int[] coins, int sum) {
        if (sum == 0) {
            return 0;  // base case
        }
        int result = Integer.MAX_VALUE;
        for (int coin: coins) {
            if (coin <= sum) {
                result = Math.min(
                        result,
                        getMinNumberOfCoins(coins, sum - coin) + 1
                );
            }
        }
        return result;
    }

}
