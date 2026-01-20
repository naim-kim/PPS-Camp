// https://www.codeground.org/practice/practiceProblemViewNew

import java.util.Scanner;

public class a036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int TC = sc.nextInt();

        for (int tc = 1; tc <= TC; tc++) {
            int N = sc.nextInt();
            long xor = 0;

            for (int i = 0; i < N; i++) {
                long x = sc.nextLong();
                if ((x & 1) == 1)
                    xor ^= x;
            }

            System.out.println("Case #" + tc);
            System.out.println(xor);
        }

        sc.close();
    }
}