// https://www.acmicpc.net/problem/10834

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int M = Integer.parseInt(br.readLine());
            System.out.println(computeFinalWheelProperties(br, M));
        }
    }

    private static String computeFinalWheelProperties(BufferedReader br, int M) throws IOException {
        long numerator = 1, denominator = 1;
        int direction = 0;

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            int s = Integer.parseInt(st.nextToken());

            numerator *= b;
            denominator *= a;

            long gcd = gcd(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;

            if (s == 1) {
                direction = 1 - direction;
            }
        }

        return direction + " " + numerator;
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}