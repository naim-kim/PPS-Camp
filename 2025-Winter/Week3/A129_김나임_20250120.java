import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int T = s.nextInt();

            int[] ways = precomputeWays(10);

            for (int i = 0; i < T; i++) {
                int n = s.nextInt();
                System.out.println(ways[n]);
            }
        }
    }

    private static int[] precomputeWays(int maxNum) {
        int[] ways = new int[maxNum + 1];
        ways[0] = 1;

        for (int i = 1; i <= maxNum; i++) {
            if (i >= 1)
                ways[i] += ways[i - 1];
            if (i >= 2)
                ways[i] += ways[i - 2];
            if (i >= 3)
                ways[i] += ways[i - 3];
        }

        return ways;
    }
}