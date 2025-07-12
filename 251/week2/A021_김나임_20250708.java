// https://www.acmicpc.net/problem/2010

import java.util.Scanner;

public class a021 {

    public static void main(String[] args) {
        new a021().run();
    }

    public void run() {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int total = 1;
        for (int i = 0; i < k; i++) {
            total += s.nextInt() - 1;
        }
        System.out.println(total);
        s.close();
    }
}