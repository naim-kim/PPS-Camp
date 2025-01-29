//Electrical Outlets

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int K = s.nextInt();
            System.out.println(calculateTotal(s, K));
        }
    }

    private static int calculateTotal(Scanner s, int K) {
        int total = 1;
        for (int i = 0; i < K; i++) {
            total += s.nextInt() - 1;
        }
        return total;
    }
}