// https://www.acmicpc.net/problem/5355

import java.util.Scanner;

public class a035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 0; tc < T; tc++) {
            double val = sc.nextDouble();
            sc.nextLine(); // move to operators
            String[] ops = sc.nextLine().split(" ");
            for (String op : ops) {
                switch (op) {
                    case "@" -> val *= 3;
                    case "%" -> val += 5;
                    case "#" -> val -= 7;
                }
            }
            System.out.printf("%.2f%n", val);
        }

        sc.close();
    }
}