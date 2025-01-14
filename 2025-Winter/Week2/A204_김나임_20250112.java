//https://www.acmicpc.net/problem/1676
//팩토리얼 0의 개수

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        int cntr = 0;

        for (int i = 5; i <= n; i *= 5) {
            cntr += n / i;
        }

        System.out.println(cntr);
    }
}