//https://www.acmicpc.net/problem/11022
//A+B - 8

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int i = 1; i <= T; i++) {
            int A = s.nextInt();
            int B = s.nextInt();
            int sum = A + B;
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + sum);
        }

        s.close();
    }
}