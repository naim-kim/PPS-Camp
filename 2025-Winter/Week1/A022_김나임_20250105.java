//핸드폰 요금

import java.util.Scanner;

public class Main {
    private static int calculateCost(int time, int unit, int cost) {
        return ((time / unit) + 1) * cost;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int N = s.nextInt();
            int Yong = 0;
            int Min = 0;

            for (int i = 0; i < N; i++) {
                int time = s.nextInt();
                Yong += calculateCost(time, 30, 10);
                Min += calculateCost(time, 60, 15);
            }

            if (Yong < Min) {
                System.out.println("Y " + Yong);
            } else if (Yong > Min) {
                System.out.println("M " + Min);
            } else {
                System.out.println("Y M " + Yong);
            }
        }
    }
}