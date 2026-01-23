import java.util.*;

public class a008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] scores = new int[N];
            int sum = 0;

            for (int i = 0; i < N; i++) {
                scores[i] = sc.nextInt();
                sum += scores[i];
            }

            double avg = sum / (double) N;
            int cnt = 0;

            for (int s : scores) {
                if (s > avg)
                    cnt++;
            }

            System.out.printf("%.3f%%\n", cnt * 100.0 / N);
        }
    }
}
