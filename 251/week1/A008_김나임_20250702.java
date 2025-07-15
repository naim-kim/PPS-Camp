// https://www.acmicpc.net/problem/4344

import java.util.*;

public class a008 {
    public static void main(String[] args) {
        new a008().run();
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter number of test cases: ");
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            System.out.print(t + 1);
            int N = sc.nextInt();
            int[] scores = new int[N];
            int sum = 0;

            for (int i = 0; i < N; i++) {
                scores[i] = sc.nextInt();
                sum += scores[i];
            }

            double avg = sum / (double) N;
            int count = 0; // count above avg
            for (int score : scores) {
                if (score > avg)
                    count++;
            }

            double percent = (count * 100.0) / N;
            System.out.printf("%.3f%%\n", percent);
        }
        sc.close();
    }
}