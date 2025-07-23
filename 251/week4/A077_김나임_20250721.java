
// https://www.acmicpc.net/problem/2822
import java.util.*;

public class a077 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] scores = new int[8][2];

        for (int i = 0; i < 8; i++) {
            scores[i][0] = sc.nextInt(); // score
            scores[i][1] = i + 1; // index
        }

        Arrays.sort(scores, (a, b) -> b[0] - a[0]);

        int total = 0;
        int[] result = new int[5];

        for (int i = 0; i < 5; i++) {
            total += scores[i][0];
            result[i] = scores[i][1];
        }

        Arrays.sort(result);
        System.out.println(total);
        for (int idx : result) {
            System.out.print(idx + " ");
        }
    }
}