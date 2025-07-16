
// https://www.acmicpc.net/problem/1159
import java.util.*;

public class a046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char initial = sc.next().charAt(0);
            count.put(initial, count.getOrDefault(initial, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            if (count.getOrDefault(c, 0) >= 5) {
                sb.append(c);
            }
        }

        System.out.println(sb.length() == 0 ? "PREDAJA" : sb.toString());
    }
}