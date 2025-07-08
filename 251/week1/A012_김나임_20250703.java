
// https://leetcode.com/problems/count-primes/description/
import java.util.*;

public class a012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Number of primes less than " + n + ": " + countPrimes(n));
    }

    public static int countPrimes(int n) {
        if (n < 2)
            return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i])
                continue;
            for (int j = i * i; j < n; j += i)
                isPrime[j] = false;
        }

        int count = 0;
        for (int i = 2; i < n; i++)
            if (isPrime[i])
                count++;

        return count;
    }
}