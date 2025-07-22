
// https://www.acmicpc.net/problem/11656
import java.util.*;

public class a084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> suffixes = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            suffixes.add(s.substring(i));
        }

        Collections.sort(suffixes);
        suffixes.forEach(System.out::println);
        sc.close();
    }
}