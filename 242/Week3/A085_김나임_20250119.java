import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = Integer.parseInt(s.nextLine());
            List<String> serialNum = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                serialNum.add(s.nextLine());
            }

            serialNum.sort((a, b) -> {
                if (a.length() != b.length()) {
                    return Integer.compare(a.length(), b.length());
                }

                int sumA = getDigitSum(a);
                int sumB = getDigitSum(b);
                if (sumA != sumB) {
                    return Integer.compare(sumA, sumB);
                }

                return a.compareTo(b);
            });

            serialNum.forEach(System.out::println);
        }
    }

    private static int getDigitSum(String str) {
        return str.chars()
                .filter(Character::isDigit)
                .map(c -> c - '0')
                .sum();
    }
}