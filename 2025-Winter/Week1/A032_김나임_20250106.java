//부녀회장이 될테야
//https://www.acmicpc.net/problem/2775

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int T = s.nextInt(); // test case

        for (int t = 0; t < T; t++) {
            int k = s.nextInt();
            int n = s.nextInt();

            if (k < 1 || n > 14)
                return;

            System.out.println(peopleNum(k, n));
        }
        s.close();
    }

    public static int peopleNum(int k, int n) {

        int[][] people = new int[k + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            people[0][i] = i;
        }
        for (int floor = 1; floor <= k; floor++) {

            for (int room = 1; room <= n; room++) {

                for (int j = 1; j <= room; j++) {
                    people[floor][room] += people[floor - 1][j];
                }
            }
        }
        return people[k][n]; // numver of people from floor k room n
    }
}