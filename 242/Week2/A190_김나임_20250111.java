//https://www.acmicpc.net/problem/2480
//주사위 세계

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if (a == b && b == c) {
            System.out.print(10000 + a * 1000);
        } else if (a == b || a == c) {
            System.out.print(1000 + a * 100);
        } else if (b == c) {
            System.out.print(1000 + b * 100);
        } else {
            System.out.print(Math.max(Math.max(a, b), c) * 100);
        }

        s.close();
    }
}