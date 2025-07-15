
//https://www.acmicpc.net/problem/2775
import java.util.Scanner;

public class a032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int k = sc.nextInt(), n = sc.nextInt();
            System.out.println(getPeople(k, n));
        }

        sc.close();
    }

    private static int getPeople(int k, int n) {
        int[][] p = new int[k + 1][n + 1];
        for (int room = 1; room <= n; room++) {
            p[0][room] = room;
        }
        for (int floor = 1; floor <= k; floor++) {
            for (int room = 1; room <= n; room++) {
                int sum = 0;
                for (int j = 1; j <= room; j++) {
                    sum += p[floor - 1][j];
                }
                p[floor][room] = sum;
            }
        }
        return p[k][n];
    }
}