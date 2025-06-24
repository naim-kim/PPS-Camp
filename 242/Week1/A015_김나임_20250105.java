//검증수
//https://www.acmicpc.net/problem/2475

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int result = 0;
        for (int i = 0; i < 5; i++) {
            int num = s.nextInt();
            result += num * num;
        }

        System.out.println(result % 10);
    }
}