//평균은 넘겠지
//https://www.acmicpc.net/problem/4344

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int C = s.nextInt(); // num of test cases
        while (C-- > 0) {
            int N = s.nextInt(); // num of students
            int[] grades = new int[N];
            int sum = 0;

            for (int j = 0; j < N; j++) {
                grades[j] = s.nextInt();
                sum += grades[j];
            }

            double avg = sum / (double) N;
            double cntr = 0; // count above average
            for (int grade : grades) {
                if (grade > avg) {
                    cntr++;
                }
            }
            System.out.printf("%.3f%%\n", (cntr / N) * 100);
        }

        s.close();
    }
}