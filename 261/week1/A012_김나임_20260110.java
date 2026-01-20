import java.util.*;

public class a012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println(0);
            return;
        }

        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);

        for (int i = 2; i * i < n; i++) {
            if (!prime[i])
                continue;
            for (int j = i * i; j < n; j += i)
                prime[j] = false;
        }

        int count = 0;
        for (int i = 2; i < n; i++)
            if (prime[i])
                count++;

        System.out.println(count);
    }
}