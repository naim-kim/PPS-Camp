// https://www.acmicpc.net/problem/5355

import java.util.Scanner;

public class a035 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine()); // read full line

        for (int i = 0; i < n; i++) {
            String[] tokens = s.nextLine().split(" ");
            float num = Float.parseFloat(tokens[0]);

            for (int j = 1; j < tokens.length; j++) {
                switch (tokens[j]) {
                    case "@":
                        num *= 3;
                        break;
                    case "%":
                        num += 5;
                        break;
                    case "#":
                        num -= 7;
                        break;
                }
            }

            System.out.printf("%.2f%n", num);
        }

        s.close();
    }
}
