
// https://www.acmicpc.net/problem/8958
import java.util.*;

public class a052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String result = sc.nextLine();
            int score = 0, streak = 0;
            for (char c : result.toCharArray()) {
                if (c == 'O') {
                    streak++;
                    score += streak;
                } else {
                    streak = 0;
                }
            }
            System.out.println(score);
        }
    }
}