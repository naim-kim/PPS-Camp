// https://www.acmicpc.net/problem/2231

import java.util.Scanner;
public class Main {
    public static int digitSum(int num) {
        int sum = num;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int N = s.nextInt();
            int generator = 0;
            for (int i = N - 54; i < N; i++) {
                if (i > 0 && digitSum(i) == N) {
                    generator = i;
                    break;
                }
            }
            System.out.println(generator);
        }
        s.close();
    }
}