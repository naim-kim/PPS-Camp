
// https://www.acmicpc.net/problem/2953
import java.util.Scanner;

public class a033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bestIdx = 0, bestSum = 0;

        for (int i = 1; i <= 5; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++)
                sum += sc.nextInt();
            if (sum > bestSum) {
                bestSum = sum;
                bestIdx = i;
            }
        }

        sc.close();
        System.out.println(bestIdx + " " + bestSum);
    }
}