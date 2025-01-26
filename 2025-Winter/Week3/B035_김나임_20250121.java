import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int K = s.nextInt();

            int[] coins = new int[N];
            for (int i = 0; i < N; i++) {
                coins[i] = s.nextInt();
            }

            System.out.println(calculateMinimumCoins(N, K, coins));
        }
    }

    private static int calculateMinimumCoins(int N, int K, int[] coins) {
        int coinCntr = 0;

        for (int i = N - 1; i >= 0 && K > 0; i--) {
            coinCntr += K / coins[i];
            K %= coins[i];
        }

        return coinCntr;
    }
}