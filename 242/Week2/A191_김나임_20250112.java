//https://www.acmicpc.net/problem/10950
//A+B - 3

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            int a = s.nextInt();
            int b = s.nextInt();
            if (a >= 0 && b < 10) {
                System.out.println(a + b);
            }
        }
        s.close();
    }
}