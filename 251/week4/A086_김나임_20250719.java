
// https://www.acmicpc.net/problem/1755
import java.util.*;

public class a086 {
    private static final String[] ENG = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = m; i <= n; i++) {
            numbers.add(i);
        }

        numbers.sort(Comparator.comparing(a086::convertToWords));

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }

        sc.close();
    }

    private static String convertToWords(int num) {
        StringBuilder sb = new StringBuilder();
        for (char c : String.valueOf(num).toCharArray()) {
            sb.append(ENG[c - '0']).append(" ");
        }
        return sb.toString();
    }
}