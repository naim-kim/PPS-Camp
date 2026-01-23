
import java.util.*;

class a059 {
    public static void solve(int caseNum, int[] scores, int k) {
        Arrays.sort(scores);
        int n = scores.length;
        int sum = 0;
        for (int i = n - 1; i >= n - k; i--) {
            sum += scores[i];
        }
        System.out.println("Case #" + caseNum);
        System.out.println(sum);
    }
}