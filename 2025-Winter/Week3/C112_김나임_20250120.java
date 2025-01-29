import java.util.Scanner;

public class Main {
    private static final Long[] seq = new Long[101];

    static {
        seq[0] = 0L;
        seq[1] = 1L;
        seq[2] = 1L;
        seq[3] = 1L;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int T = s.nextInt();
            while (T-- > 0) {
                System.out.println(padovan(s.nextInt()));
            }
        }
    }

    private static long padovan(int N) {
        if (seq[N] == null) {
            seq[N] = padovan(N - 2) + padovan(N - 3);
        }
        return seq[N];
    }
}