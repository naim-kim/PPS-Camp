
// https://www.acmicpc.net/problem/1431
import java.util.*;

public class a085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> serials = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            serials.add(sc.nextLine());
        }

        serials.sort((a, b) -> {
            if (a.length() != b.length())
                return a.length() - b.length();

            int sumA = sumDigits(a);
            int sumB = sumDigits(b);
            if (sumA != sumB)
                return sumA - sumB;

            return a.compareTo(b);
        });

        serials.forEach(System.out::println);
        sc.close();
    }

    private static int sumDigits(String s) {
        return s.chars().filter(Character::isDigit).map(c -> c - '0').sum();
    }
}