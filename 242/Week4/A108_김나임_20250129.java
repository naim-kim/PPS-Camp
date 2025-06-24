// https://www.acmicpc.net/problem/3062

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int T = Integer.parseInt(br.readLine());

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < T; i++) {
                int N = Integer.parseInt(br.readLine());
                result.append(isPalindromeSum(N) ? "YES\n" : "NO\n");
            }

            System.out.print(result);
        }
    }

    private static boolean isPalindromeSum(int N) {
        int reversed = reverseNumber(N);
        int sum = N + reversed;
        return isPalindrome(sum);
    }

    private static int reverseNumber(int num) {
        return Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
    }

    private static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}