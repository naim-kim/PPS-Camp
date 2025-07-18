
// https://www.acmicpc.net/submit/11650/89026726
import java.util.*;

public class a065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }

        Arrays.sort(points, (a, b) -> {
            if (a[0] == b[0])
                return a[1] - b[1];
            return a[0] - b[0];
        });

        StringBuilder sb = new StringBuilder();
        for (int[] p : points) {
            sb.append(p[0]).append(" ").append(p[1]).append("\n");
        }
        System.out.print(sb);
    }
}