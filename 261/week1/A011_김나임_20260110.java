import java.util.*;

public class a011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();

        String[] input = sc.nextLine().split(" ");
        int[] stages = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            stages[i] = Integer.parseInt(input[i]);
        }

        int[] cnt = new int[N + 2];
        for (int s : stages)
            cnt[s]++;

        int players = stages.length;
        double[][] fail = new double[N][2];

        for (int i = 1; i <= N; i++) {
            fail[i - 1][0] = i;
            fail[i - 1][1] = players == 0 ? 0 : (double) cnt[i] / players;
            players -= cnt[i];
        }

        Arrays.sort(fail, (a, b) -> {
            if (a[1] == b[1])
                return (int) a[0] - (int) b[0];
            return Double.compare(b[1], a[1]);
        });

        int[] res = new int[N];
        for (int i = 0; i < N; i++)
            res[i] = (int) fail[i][0];

        System.out.println(Arrays.toString(res));
    }
}