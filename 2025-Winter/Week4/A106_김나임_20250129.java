import java.io.*;
import java.util.*;

public class Main {
    private static final int TOTAL = computeTotal();

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                System.out.println(calculateMissing(br.readLine()));
            }
        }
    }

    private static int computeTotal() {
        return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".chars().sum();
    }

    private static int calculateMissing(String S) {
        Set<Character> appeared = new HashSet<>();
        for (char ch : S.toCharArray()) {
            appeared.add(ch);
        }
        return TOTAL - appeared.stream().mapToInt(c -> c).sum();
    }
}