//음계 판별하기
//https://www.acmicpc.net/problem/2920

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] input = new int[8];
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < 8; i++) {
            input[i] = s.nextInt();
        }

        for (int i = 1; i < 8; i++) {
            if (input[i] > input[i - 1]) {
                descending = false;
            } else if (input[i] < input[i - 1]) {
                ascending = false;
            }
        }

        if (ascending) {
            System.out.println("ascending");
        } else if (descending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
        s.close();
    }
}