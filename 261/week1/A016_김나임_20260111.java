import java.util.*;

public class a016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int limit = sc.nextInt();

        int[] w = new int[input.length];
        for (int i = 0; i < input.length; i++)
            w[i] = Integer.parseInt(input[i]);

        Arrays.sort(w);
        int i = 0, j = w.length - 1, cnt = 0;

        while (i <= j) {
            if (w[i] + w[j] <= limit)
                i++;
            j--;
            cnt++;
        }

        System.out.println(cnt);
    }
}