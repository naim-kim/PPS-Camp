//https://www.acmicpc.net/problem/1920
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(s.nextInt());
        }

        int M = s.nextInt();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int query = s.nextInt();
            if (set.contains(query)) {
                result.append(1).append("\n");
            } else {
                result.append(0).append("\n");
            }
        }
        System.out.println(result);
        s.close();
    }
}