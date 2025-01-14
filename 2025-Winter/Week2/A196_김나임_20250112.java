//https://www.acmicpc.net/problem/10807
//개수 세기 

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = s.nextInt();
        }
        int v = s.nextInt();
        int c = 0;
        for (int i = 0; i < N; i++) {
            if (num[i] == v) {
                c++;
            }
        }
        System.out.println(c);
        s.close();
    }
}