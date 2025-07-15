
// https://www.acmicpc.net/problem/17211
import java.util.Scanner;

public class a030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int now = sc.nextInt();

        double[][] dp = new double[N + 1][2];
        dp[0][now] = 1.0;

        double[][] p = new double[2][2];
        p[0][0] = sc.nextDouble();
        p[0][1] = sc.nextDouble();
        p[1][0] = sc.nextDouble();
        p[1][1] = sc.nextDouble();

        sc.close();

        for (int i = 1; i <= N; i++) {
            dp[i][0] = dp[i - 1][0] * p[0][0] + dp[i - 1][1] * p[1][0];
            dp[i][1] = dp[i - 1][0] * p[0][1] + dp[i - 1][1] * p[1][1];
        }

        int happy = (int) Math.round(dp[N][0] * 1000);
        int sad = (int) Math.round(dp[N][1] * 1000);
        System.out.println(happy);
        System.out.println(sad);
    }
}
