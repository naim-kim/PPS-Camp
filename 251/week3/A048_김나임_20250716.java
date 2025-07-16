
// https://www.acmicpc.net/problem/1316
import java.util.*;

public class a048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = sc.nextLine();
            boolean[] seen = new boolean[26];
            boolean isGroup = true;
            char prev = 0;

            for (char c : word.toCharArray()) {
                if (c != prev) {
                    if (seen[c - 'a']) {
                        isGroup = false;
                        break;
                    }
                    seen[c - 'a'] = true;
                }
                prev = c;
            }

            if (isGroup)
                count++;
        }

        System.out.println(count);
    }
}