import java.util.*;

public class Main {
    private static final int MAX = 100;

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int[] padovan = precomputePadovanSequence(MAX);

            int T = s.nextInt();
            for (int i = 0; i < T; i++) {
                int N = s.nextInt();
                System.out.println(padovan[N]);
            }
        }
    }

    private static int[] precomputePadovanSequence(int maxN) {
        int[] padovan = new int[maxN + 1];
        padovan[1] = 1;
        padovan[2] = 1;
        padovan[3] = 1;

        for (int i = 4; i <= maxN; i++) {
            padovan[i] = padovan[i - 2] + padovan[i - 3];
        }

        return padovan;
    }
}