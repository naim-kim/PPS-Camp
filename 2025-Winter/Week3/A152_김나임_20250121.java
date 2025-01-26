import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] stairs = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                stairs[i] = s.nextInt();
            }

            System.out.println(calculateMaxScore(n, stairs));
        }
    }

    private static int calculateMaxScore(int n, int[] stairs) {
        if (n == 1)
            return stairs[1];

        int[] dp = new int[n + 1];
        dp[1] = stairs[1];
        dp[2] = stairs[1] + stairs[2];

        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i - 2] + stairs[i], dp[i - 3] + stairs[i - 1] + stairs[i]);
        }

        return dp[n];
    }
}