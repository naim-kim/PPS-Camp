//https://www.acmicpc.net/problem/2839

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        
        if (n < 3 || n > 5000)
            return;

        int cntr = 0; // packages

        if (n % 5 == 0) {
            System.out.println(n / 5);
        } else {
            while (n > 0) {
                n -= 3;
                cntr++;

                if (n % 5 == 0) { // 나머지 / 5
                    cntr += n / 5;
                    System.out.println(cntr);
                    return;
                } else if (n == 1 || n == 2) { // 안되는케이스스
                    System.out.println(-1);
                    return;
                } else if (n == 0) { // 3 으로 나누기 ㄱㄴ
                    System.out.println(cntr);
                    return;
                }
            }
            // no solution
            System.out.println(-1);
        }
    }
}